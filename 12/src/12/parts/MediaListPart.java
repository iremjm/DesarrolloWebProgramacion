package 12.parts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import 12.handlers.OpenHandler;
import 12.model.Media;
import 12.model.MediaType;

@SuppressWarnings("restriction")
public class MediaListPart {
	static class MediaCell extends ListCell<Media> {
		@Override
		protected void updateItem(Media item, boolean empty) {
			if(  ! empty && item != null ) {
				setText(item.getName());
				switch (item.getType()) {
				case MOVIE:
					setGraphic(new ImageView("platform:/plugin/12/icons/kaffeine.png"));
					break;
				case PICTURE:
					setGraphic(new ImageView("platform:/plugin/12/icons/games-config-background.png"));
					break;
				default:
					setGraphic(new ImageView("platform:/plugin/12/icons/player-volume.png"));
					break;
				}				
			}
			super.updateItem(item, empty);
		}
	}
	
	
	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;
	
	@Inject
	MApplication application;
	
	private ListView<Media> list;
	
	@PostConstruct
	void init(BorderPane pane) {
		list = new ListView<Media>(createList());
		list.setId("mediaList");
		list.setCellFactory(new Callback<ListView<Media>, ListCell<Media>>() {
			
			@Override
			public ListCell<Media> call(ListView<Media> param) {
				return new MediaCell();
			}
		});
		list.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( event.getClickCount() > 1 ) {
					handleOpen();
				}
			}
		});
		pane.setCenter(list);
	}
	
	void handleOpen() {
		MPartStack stack = (MPartStack) modelService.find("content.stack", application);
		Media m = list.getSelectionModel().getSelectedItem();
		String instance = Media.serialize(m);
				
		for( MStackElement e : stack.getChildren() ) {
			if( e instanceof MPart ) {
				if( instance.equals(e.getPersistedState().get(MediaPart.MEDIA_OBJECT_KEY)) ) {
					partService.activate((MPart) e);
					return;
				}
			}
		}
		
		MPart p = MBasicFactory.INSTANCE.createPart();
		p.setLabel(m.getName());
		if( m.getType() == MediaType.MOVIE ) {
			p.setIconURI("platform:/plugin/12/icons/22/kaffeine.png");	
		} else if( m.getType() == MediaType.PICTURE ) {
			p.setIconURI("platform:/plugin/12/icons/22/games-config-background.png");
		} else {
			p.setIconURI("platform:/plugin/12/icons/22/player-volume.png");
		}
		
		p.setContributionURI("bundleclass://12/12.parts.MediaPart");
		p.getPersistedState().put(MediaPart.MEDIA_OBJECT_KEY, instance);
		stack.getChildren().add(p);
		partService.activate(p,true);
	}
	
	@Focus
	void focus() {
		list.requestFocus();
	}
	
	@Inject
	@Optional
	public void openMedia(@UIEventTopic(OpenHandler.OPEN_EVENT) String event) {
		handleOpen();
	}
	
	private static ObservableList<Media> createList() {
		ObservableList<Media> l = FXCollections.observableArrayList();
		l.add(new Media(MediaType.PICTURE, "Desert",     "platform:/plugin/12/icons/resources/pics/pic1.jpg"));
		l.add(new Media(MediaType.PICTURE, "Lighthouse", "platform:/plugin/12/icons/resources/pics/pic2.jpg"));
		l.add(new Media(MediaType.MOVIE,   "Grog",       "platform:/plugin/12/icons/resources/movs/mov1.flv"));
		l.add(new Media(MediaType.MOVIE,   "OTN",        "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"));
		return l;
	}
}
