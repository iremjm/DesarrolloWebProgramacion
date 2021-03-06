package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.GestorPlantacioneBBDD;
import model.GestorPlantacionesFicheros;
import model.IGestorPlantaciones;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;

import datos.GestorBDSQLite;
import datos.Plantacion;

import javax.swing.event.ListSelectionEvent;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSlider;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JSpinner txtCantPlant;
	private JTextField txtFechaRec;
	private JTextField txtCantRec;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private JSpinner spinnerCantPlant;
	private JList listPlantaciones;
	private IGestorPlantaciones gp = new GestorPlantacioneBBDD();
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	private DefaultListModel<Plantacion> dlm = new DefaultListModel<Plantacion>();
	GestorBDSQLite gbd = new GestorBDSQLite();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantacionesUI frame = new PlantacionesUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public PlantacionesUI() {
		
		setTitle("Plantaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(21, 23, 46, 14);
		contentPane.add(lblListado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(21, 67, 148, 178);
		contentPane.add(scrollPane);
		
				
				listPlantaciones = new JList();
				scrollPane.setViewportView(listPlantaciones);
				listPlantaciones.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						// Para que aparezca una vez solamente el elemento
						if (!arg0.getValueIsAdjusting()) {
							Plantacion p=(Plantacion) listPlantaciones.getSelectedValue();
							if (p!=null){
								mostrarDatos(p);
								// devulelve el elemento
								System.out.println(listPlantaciones.getSelectedValue());
							}
						}
					}
				});

		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(219, 100, 127, 14);
		contentPane.add(lblFechaPlantacion);

		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(327, 98, 86, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);

		JLabel lblNewLabel = new JLabel("Cantidad Plantada:");
		lblNewLabel.setBounds(219, 159, 127, 14);
		contentPane.add(lblNewLabel);

		txtCantPlant = new JSpinner();
		txtCantPlant.setBounds(327, 156, 86, 20);
		txtCantPlant.setValue(300);
		contentPane.add(txtCantPlant);

		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(219, 194, 127, 14);
		contentPane.add(lblFechaRecogida);

		txtFechaRec = new JTextField();
		txtFechaRec.setBounds(327, 187, 86, 20);
		contentPane.add(txtFechaRec);
		txtFechaRec.setColumns(10);

		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
		lblCantidadRecogida.setBounds(219, 219, 127, 14);
		contentPane.add(lblCantidadRecogida);

		txtCantRec = new JTextField();
		txtCantRec.setBounds(327, 218, 86, 20);
		contentPane.add(txtCantRec);
		txtCantRec.setColumns(10);

		// Bot�n nueva plantaci�n
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(21, 274, 89, 23);
		contentPane.add(btnNuevo);

		// Bot�n recolectar
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRecolectarClick();
			}
		});
		btnRecolectar.setBounds(120, 274, 100, 23);
		contentPane.add(btnRecolectar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int opcion = JOptionPane.showConfirmDialog(null, "�Desea salir de la aplicaci�n?",
			"Seleccione una opci�n", JOptionPane.YES_NO_OPTION);
					if(opcion==JOptionPane.YES_OPTION){
						System.exit(0);		
				}
				btnCancelarClick();
			}
		});
		btnSalir.setBounds(324, 274, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(219, 134, 127, 14);
		contentPane.add(lblEspecie);

		txtEspecie = new JTextField();
		txtEspecie.setBounds(327, 125, 86, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);

		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(219, 75, 127, 14);
		contentPane.add(lblParcela);

		txtParcela = new JTextField();
		txtParcela.setBounds(327, 69, 86, 20);
		contentPane.add(txtParcela);
		txtParcela.setColumns(10);	
		
		JButton btnDelete = new JButton("Eliminar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarPlantacion();
			}

			private void eliminarPlantacion() {
				int selected_index = listPlantaciones.getSelectedIndex();
				if(selected_index<0){
					 JOptionPane.showMessageDialog(null, "Debe seleccionar una plantaci�n.");
				}
				Plantacion plantacion_seleccionada = (Plantacion) listPlantaciones.getModel().getElementAt(selected_index);
				dlm.remove(selected_index);
				String query = "DELETE FROM PLANTACIONES WHERE PARCELA= " + plantacion_seleccionada.getParcela() +
						" AND FECHAPLAN= '"+ sdf.format(plantacion_seleccionada.getFechaPlan())+"';";
				gbd.updateSQL(query);
				

			}
		});
		btnDelete.setBounds(225, 274, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Actualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//definimos los valores de las cajas de texto
				int selected_index = listPlantaciones.getSelectedIndex();
				if(selected_index<0){
					 JOptionPane.showMessageDialog(null, "Debe seleccionar una plantaci�n.");
				}else{Plantacion plantacion_seleccionada = (Plantacion) listPlantaciones.getModel().getElementAt(selected_index);
				int parcela= Integer.parseInt(txtParcela.getText());
				try {
					Date fechaPlant = sdf.parse(txtFechaPlant.getText());
					plantacion_seleccionada.setFechaPlan(fechaPlant);
				} catch (ParseException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Date fechaRec = sdf.parse(txtFechaRec.getText());
					plantacion_seleccionada.setFechaRec(fechaRec);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				/*Actualizar los datos de la plantaci�n*/
				plantacion_seleccionada.setParcela(parcela);
				//Coger los datos de la plantaaci�n
				plantacion_seleccionada.setEspecie(txtEspecie.getText());
				plantacion_seleccionada.setCantPlant((int) txtCantPlant.getValue());
				
				
				String especie = txtEspecie.getText();
				int cantPlant = (Integer)txtCantPlant.getValue();
				String query = "UPDATE PLANTACIONES SET PARCELA=" +plantacion_seleccionada.getParcela() + "," 
						+ "FECHAPLAN='"+sdf.format(plantacion_seleccionada.getFechaPlan()) + "',"
						+ "FECHAREC='"+sdf.format(plantacion_seleccionada.getFechaRec())+ "',"
						+ "ESPECIE='"+ plantacion_seleccionada.getEspecie()+"',"
						+ "CANTPLANT="+plantacion_seleccionada.getCantPlant()
						+" WHERE PARCELA="+plantacion_seleccionada.getParcela() +" AND "
						+ "FECHAPLAN='"+sdf.format(plantacion_seleccionada.getFechaPlan())+"'"
						+";";
				//System.out.println(query);
						gbd.updateSQL(query);
				}
			}
		});
		btnUpdate.setBounds(21, 308, 116, 23);
		contentPane.add(btnUpdate);
		// pedir las plantaciones al gestor de plantaciones
	actualizarListado(gp.getPlantaciones());		
	}
	// Acceder a Editar plantaciones
	private void btnNuevoClick() {
		PlantacionesEditUI frmPlantEdit = new PlantacionesEditUI(this, gp);
		frmPlantEdit.setVisible(true);
	}

	// Acceder a recolectar
	private void btnRecolectarClick() {
		int selected_index = listPlantaciones.getSelectedIndex();
		if(selected_index<0){
			 JOptionPane.showMessageDialog(null, "Debe seleccionar una plantaci�n.");
		}
		Plantacion plantacion_seleccionada = (Plantacion) listPlantaciones.getModel().getElementAt(selected_index);
		PlantacionesUIREc frmPlantRecol = new PlantacionesUIREc(this, gp, plantacion_seleccionada);
		frmPlantRecol.setVisible(true);
	}
	// muestra los datos del parametro en el jList
	public void actualizarListado(ArrayList<Plantacion> lstPlantas) {
		dlm.clear();
		// a�adir las plantaciones pasadas como parametro en el ArrayList
		for (Plantacion p : lstPlantas) {
			dlm.addElement(p);
		}
		// pasar el model Jlist
		listPlantaciones.setModel(dlm);
		if (listPlantaciones.getModel().getSize()>0)
			listPlantaciones.setSelectedIndex(0);
	}
	// cargar la informaci�n de una plantaci�n en las cajas de texto Al
	// seleccionarlas.
	public void mostrarDatos(Plantacion p) {
		
		txtParcela.setText(Integer.toString(p.getParcela()));
		txtFechaPlant.setText(sdf.format(p.getFechaPlan()));
		txtEspecie.setText(p.getEspecie().toString());
		txtCantPlant.setValue(new Integer(p.getCantPlant()));
		txtCantRec.setText(p.getCantRec()+"");
		txtFechaRec.setText(sdf.format(p.getFechaRec()));
	}
	public void btnCancelarClick(){
		int opcion = JOptionPane.showConfirmDialog(null, "�Desea salir de insertar plantaci�n?",
				"Seleccione una opci�n", JOptionPane.YES_NO_OPTION);
					if(opcion==JOptionPane.YES_OPTION){
					this.dispose();	
					}		
	}
}