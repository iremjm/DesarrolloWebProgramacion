package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Contacto;
import model.GestorContactos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactosUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtEdad;
	private JTextField txtIndice;
	private GestorContactos gc = new GestorContactos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactosUI frame = new ContactosUI();
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
	public ContactosUI() {
		setTitle("Contacts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(63, 58, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(63, 96, 62, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(63, 130, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblIndice = new JLabel("Indice:");
		lblIndice.setBounds(63, 168, 46, 14);
		contentPane.add(lblIndice);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(163, 55, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(163, 93, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(163, 127, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtIndice = new JTextField();
		txtIndice.setBounds(163, 165, 86, 20);
		contentPane.add(txtIndice);
		txtIndice.setColumns(10);
		txtIndice.setEditable(false);
		
		JButton btnPrimero = new JButton("|<");
		btnPrimero.setBounds(20, 11, 46, 23);
		contentPane.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<<");
		btnAnterior.setBounds(77, 11, 48, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">>");
		btnSiguiente.setBounds(134, 11, 48, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">|");
		btnUltimo.setBounds(190, 11, 46, 23);
		contentPane.add(btnUltimo);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(20, 215, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardarClick();
			}
		});
		btnGuardar.setBounds(129, 215, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminarClick();
			}
		});
		btnEliminar.setBounds(244, 215, 89, 23);
		contentPane.add(btnEliminar);
	}
	public void btnNuevoClick(){
		txtNombre.setText(null);
		txtEdad.setText(null);
		txtTelefono.setText(null);
		txtIndice.setText(""+gc.getSizeContactos());
		txtNombre.requestFocus();
		
	}
	public void btnGuardarClick(){
		Contacto c=new Contacto();
		c.setNom(txtNombre.getText());
		c.setEdad(Integer.parseInt(txtEdad.getText()));
		c.setTlfno(txtTelefono.getText());
		
		if(gc.getSizeContactos()==Integer.parseInt(txtIndice.getText())){
			gc.addContacto(c);
		}else{
			gc.modContacto(c,Integer.parseInt(txtIndice.getText()));
		}
	}
	public void btnEliminarClick(){
		gc.delContacto(Integer.parseInt(txtIndice.getText()));
	}
}
