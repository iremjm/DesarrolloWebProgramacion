package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.GestorPlantaciones;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JTextField txtCantPlant;
	private JTextField txtFechaRec;
	private JTextField textField;
	private JTextField txtParcela;
	private JTextField txtEspecie;
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
		setBounds(100, 100, 451, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(20, 11, 46, 14);
		contentPane.add(lblListado);
		
		//JList listPlantaciones = new JList(gp.getPlantaciones().toArray());
		JList listPlantaciones = new JList();
		listPlantaciones.setBounds(20, 36, 115, 180);
		//pedir las plantaciones al gestor de plantaciones
		contentPane.add(listPlantaciones);
		
		JLabel lblFechaPlantacin = new JLabel("Fecha Plantaci\u00F3n:");
		lblFechaPlantacin.setBounds(156, 11, 115, 14);
		contentPane.add(lblFechaPlantacin);
		
		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(156, 34, 115, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);
		
		JLabel lblCantidadPlant = new JLabel("Cantidad Plant:");
		lblCantidadPlant.setBounds(156, 65, 115, 14);
		contentPane.add(lblCantidadPlant);
		
		txtCantPlant = new JTextField();
		txtCantPlant.setColumns(10);
		txtCantPlant.setBounds(156, 88, 115, 20);
		contentPane.add(txtCantPlant);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(156, 119, 115, 14);
		contentPane.add(lblFechaRecogida);
		
		txtFechaRec = new JTextField();
		txtFechaRec.setColumns(10);
		txtFechaRec.setBounds(156, 142, 115, 20);
		contentPane.add(txtFechaRec);
		
		JLabel lblCantidadRec = new JLabel("Cantidad Rec:");
		lblCantidadRec.setBounds(156, 173, 115, 14);
		contentPane.add(lblCantidadRec);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(156, 196, 115, 20);
		contentPane.add(textField);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(20, 250, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.setBounds(130, 250, 89, 23);
		contentPane.add(btnRecolectar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(240, 250, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblPacela = new JLabel("Pacela:");
		lblPacela.setBounds(286, 11, 115, 14);
		contentPane.add(lblPacela);
		
		txtParcela = new JTextField();
		txtParcela.setColumns(10);
		txtParcela.setBounds(286, 34, 115, 20);
		contentPane.add(txtParcela);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(286, 65, 115, 14);
		contentPane.add(lblEspecie);
		
		txtEspecie = new JTextField();
		txtEspecie.setColumns(10);
		txtEspecie.setBounds(286, 88, 115, 20);
		contentPane.add(txtEspecie);
	}
	private void btnNuevoClick(){
		PlantacionesEditUI frmPlantEdit=new PlantacionesEditUI(gp);
		frmPlantEdit.setVisible(true);
	}
}
