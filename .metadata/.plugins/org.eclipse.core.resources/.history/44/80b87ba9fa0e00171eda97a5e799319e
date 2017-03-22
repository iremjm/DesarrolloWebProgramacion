package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;
import model.Plantacion;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlantacionesUIREc extends JFrame {

	private JPanel contentPane;
	private JTextField txtEspecie;
	private JTextField txtFechaRec;
	private JTextField txtCantidadREcol;
	private GestorPlantaciones gp;
	private PlantacionesUI frmPrincipal;
	private JTextField txtParcela;
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
	private Plantacion p_seleccionada;

	public PlantacionesUIREc(PlantacionesUI frmPrincipal, GestorPlantaciones gp, Plantacion p_seleccionada) {
		// asiganr el mismo gestor de plantaciones
		this.gp=gp;
		this.frmPrincipal = frmPrincipal;
		this.p_seleccionada = p_seleccionada;// que plantación está seleccionada
		setTitle("Recolectar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtEspecie = new JTextField(this.p_seleccionada.getEspecie());
		txtEspecie.setBounds(183, 42, 115, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);

		JLabel labelespecieRecol = new JLabel("Especie");
		labelespecieRecol.setBounds(36, 45, 46, 14);
		contentPane.add(labelespecieRecol);

		JLabel lablFechaRecolecta = new JLabel("Fecha Recolecta");
		lablFechaRecolecta.setBounds(36, 73, 115, 14);
		contentPane.add(lablFechaRecolecta);

		txtFechaRec = new JTextField(this.sdf.format(p_seleccionada.getFechaRec()));
		txtFechaRec.setBounds(183, 70, 115, 20);
		contentPane.add(txtFechaRec);
		txtFechaRec.setColumns(10);

		JLabel labelFechaRecol = new JLabel("Cantidad Recolectada");
		labelFechaRecol.setBounds(36, 101, 148, 14);
		contentPane.add(labelFechaRecol);

		txtCantidadREcol = new JTextField("");
		txtCantidadREcol.setBounds(183, 98, 115, 20);
		contentPane.add(txtCantidadREcol);
		txtCantidadREcol.setColumns(10);

		JButton buttonAceptRecol = new JButton("Aceptar");
		buttonAceptRecol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAceptarClick();
			}
		});
		buttonAceptRecol.setBounds(47, 145, 89, 23);
		contentPane.add(buttonAceptRecol);

		JButton buttonCancelRecol = new JButton("Cancelar");
		buttonCancelRecol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelarClick();
			}
		});
		buttonCancelRecol.setBounds(194, 145, 89, 23);
		contentPane.add(buttonCancelRecol);

		JLabel labelParcela = new JLabel("Parcela");
		labelParcela.setBounds(36, 20, 46, 14);
		contentPane.add(labelParcela);

		txtParcela = new JTextField(this.p_seleccionada.getParcela() + "");
		txtParcela.setBounds(183, 11, 115, 20);
		contentPane.add(txtParcela);
		txtParcela.setColumns(10);

	}

	private void btnAceptarClick() {
		// leer los datos introducidos por el usuario
		int parcela = Integer.parseInt(txtParcela.getText());
		Date fechaRec = null;
		try {
			fechaRec = sdf.parse(txtFechaRec.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int cantRecol = Integer.parseInt(txtCantidadREcol.getText());
		String especie = txtEspecie.getText();
		p_seleccionada.setCantRec(cantRecol);
		// decir al gestor de plantaciones que añada la plantacion
		gp.recolectar(parcela, fechaRec, cantRecol);
		// actualizar la lista de la ventana principal
		frmPrincipal.mostrarDatos(p_seleccionada);
		// descargar la ventana
		this.dispose();
	}
	public void btnCancelarClick(){
		int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir de la recolecta?",
				"Seleccione una opción", JOptionPane.YES_NO_OPTION);
					if(opcion==JOptionPane.YES_OPTION){
					this.dispose();		
					}
	}

}