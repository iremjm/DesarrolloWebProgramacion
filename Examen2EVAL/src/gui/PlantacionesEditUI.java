package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;
import model.Plantacion;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class PlantacionesEditUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JTextField txtCantPlant;
	private JTextField txtFechaRec;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private GestorPlantaciones gp;
	private PlantacionesUI frmPrincipal;
	private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Create the frame.
	 */
	public PlantacionesEditUI(PlantacionesUI frmPrincipal, GestorPlantaciones gp) {
		this.frmPrincipal=frmPrincipal;	
		//asignar el mismo gestor de plantaciones
			this.gp=gp;
			setTitle("Edicion de Plantaciones");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 299, 299);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
			lblFechaPlantacion.setBounds(21, 36, 85, 14);
			contentPane.add(lblFechaPlantacion);
			
			txtFechaPlant = new JTextField();
			txtFechaPlant.setBounds(160, 41, 86, 20);
			contentPane.add(txtFechaPlant);
			txtFechaPlant.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Cantidad Plantada:");
			lblNewLabel.setBounds(21, 122, 100, 14);
			contentPane.add(lblNewLabel);
			
			txtCantPlant = new JTextField();
			txtCantPlant.setBounds(160, 121, 86, 20);
			contentPane.add(txtCantPlant);
			txtCantPlant.setColumns(10);
			
			JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
			lblFechaRecogida.setBounds(21, 161, 94, 14);
			contentPane.add(lblFechaRecogida);
			
			txtFechaRec = new JTextField();
			txtFechaRec.setBounds(160, 161, 86, 20);
			contentPane.add(txtFechaRec);
			txtFechaRec.setColumns(10);
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnAceptarClick();
				}
			});
			btnAceptar.setBounds(21, 207, 89, 23);
			contentPane.add(btnAceptar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(131, 207, 89, 23);
			contentPane.add(btnCancelar);
			
			JLabel lblEspecie = new JLabel("Especie:");
			lblEspecie.setBounds(21, 83, 65, 14);
			contentPane.add(lblEspecie);
			
			txtEspecie = new JTextField();
			txtEspecie.setBounds(160, 81, 86, 20);
			contentPane.add(txtEspecie);
			txtEspecie.setColumns(10);
			
			JLabel lblParcela = new JLabel("Parcela:");
			lblParcela.setBounds(21, 11, 46, 14);
			contentPane.add(lblParcela);
			
			txtParcela = new JTextField();
			txtParcela.setBounds(160, 12, 86, 20);
			contentPane.add(txtParcela);
			txtParcela.setColumns(10);
		}
		private void btnAceptarClick(){
			//leer los datos introducidos por el usuario
			int parcela=Integer.parseInt(txtParcela.getText());
			Date fechaPlan=null;
			Date fechaRec=null;
			try {
				fechaPlan=sdf.parse(txtFechaPlant.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fechaRec=sdf.parse(txtFechaRec.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String especie=txtEspecie.getText();
			int cantPlant=Integer.parseInt(txtCantPlant.getText());
			//crear una plantacion con datos
			Plantacion p=new Plantacion(parcela,fechaPlan,fechaRec,especie,cantPlant);
			//decir al gestor de plantaciones que a�ada la plantacion
			gp.plantar(p);
			//actualizar la lista de la ventana principal
			frmPrincipal.actualizarListado(gp.getPlantaciones());
			//descargar la ventana
			this.dispose();
		}
}


