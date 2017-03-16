package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;
import model.Plantacion;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JTextField txtCantPlant;
	private JTextField txtFechaRec;
	private JTextField txtCantRec;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private JList listPlantaciones;
	private GestorPlantaciones gp=new GestorPlantaciones();

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
		setBounds(100, 100, 439, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(21, 21, 46, 14);
		contentPane.add(lblListado);
		
		//JList listPlantaciones = new JList(gp.getPlantaciones().toArray());
		listPlantaciones = new JList();
		listPlantaciones.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				//devuelve el elemento
				System.out.println(listPlantaciones.getSelectedValue());
			}
		});
		listPlantaciones.setBounds(21, 44, 148, 153);
		//pedir las plantaciones al gestor de plantaciones	
		actualizarListado(gp.getPlantaciones());
		contentPane.add(listPlantaciones);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(179, 46, 127, 14);
		contentPane.add(lblFechaPlantacion);
		
		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(327, 44, 86, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cantidad Plantada:");
		lblNewLabel.setBounds(179, 132, 127, 14);
		contentPane.add(lblNewLabel);
		
		txtCantPlant = new JTextField();
		txtCantPlant.setBounds(327, 124, 86, 20);
		contentPane.add(txtCantPlant);
		txtCantPlant.setColumns(10);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(179, 171, 127, 14);
		contentPane.add(lblFechaRecogida);
		
		txtFechaRec = new JTextField();
		txtFechaRec.setBounds(327, 164, 86, 20);
		contentPane.add(txtFechaRec);
		txtFechaRec.setColumns(10);
		
		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
		lblCantidadRecogida.setBounds(179, 208, 127, 14);
		contentPane.add(lblCantidadRecogida);
		
		txtCantRec = new JTextField();
		txtCantRec.setBounds(327, 195, 86, 20);
		contentPane.add(txtCantRec);
		txtCantRec.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(21, 227, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.setBounds(131, 227, 100, 23);
		contentPane.add(btnRecolectar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(237, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(179, 93, 127, 14);
		contentPane.add(lblEspecie);
		
		txtEspecie = new JTextField();
		txtEspecie.setBounds(327, 84, 86, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(179, 21, 127, 14);
		contentPane.add(lblParcela);
		
		txtParcela = new JTextField();
		txtParcela.setBounds(327, 15, 86, 20);
		contentPane.add(txtParcela);
		txtParcela.setColumns(10);
	}
	private void btnNuevoClick(){
		PlantacionesEditUI frmPlantEdit=new PlantacionesEditUI(this,gp);
		frmPlantEdit.setVisible(true);
	}
	//muestra los datos del parametro en el jList
	public void actualizarListado(ArrayList<Plantacion> lstPlantas){
		DefaultListModel<Plantacion> dlm=new DefaultListModel<Plantacion>();
		//a�adir las plantaciones pasadas como parametro en el ArrayList
		for(Plantacion p:lstPlantas){
			dlm.addElement(p);
		}
		//pasar el model Jlist
		listPlantaciones.setModel(dlm);
	}
}
