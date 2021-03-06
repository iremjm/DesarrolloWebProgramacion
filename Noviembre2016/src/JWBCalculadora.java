import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JWBCalculadora extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;
	//Definimos a nivel de la clase para poder tener acceso a ellos desde cualquier metodo
	private JCheckBox chkPositivo;
	private JCheckBox chkNegativo;
	private JCheckBox chkNeutro;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JWBCalculadora frame = new JWBCalculadora();
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
	public JWBCalculadora() {
		setTitle("SuperCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 321);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmSuma = new JMenuItem("Suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("+");
			}
		});
		mnOperaciones.add(mntmSuma);
		
		JMenuItem mntmResta = new JMenuItem("Resta");
		mnOperaciones.add(mntmResta);
		
		JMenuItem mntmMultiplicacin = new JMenuItem("Producto");
		mnOperaciones.add(mntmMultiplicacin);
		
		JMenuItem mntmDivisin = new JMenuItem("Divisi\u00F3n");
		mnOperaciones.add(mntmDivisin);
		
		JMenu mnOtros = new JMenu("Otros");
		mnOperaciones.add(mnOtros);
		
		JMenuItem mntmOpcin = new JMenuItem("Opci\u00F3n 1");
		mnOtros.add(mntmOpcin);
		
		JMenuItem mntmOpcion = new JMenuItem("Opci\u00F3n 2");
		mnOtros.add(mntmOpcion);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "�Est�s seguro que desea salir?");
				int opcion = JOptionPane.showConfirmDialog(null, "�Desea salir de la aplicaci�n?",
						"Seleccione una opci�n", JOptionPane.YES_NO_OPTION);
				if(opcion==JOptionPane.YES_OPTION){
					System.exit(0);		
			}
			}
		});
		menuBar.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero1:");
		lblNumero.setBounds(52, 14, 65, 14);
		contentPane.add(lblNumero);

		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(52, 39, 65, 14);
		contentPane.add(lblNumero_1);

		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(52, 64, 65, 14);
		contentPane.add(lblResultado);

		txtNumero1 = new JTextField();
		txtNumero1.setBounds(120, 11, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);

		txtNumero2 = new JTextField();
		txtNumero2.setBounds(120, 36, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);

		txtResultado = new JTextField();
		txtResultado.setBounds(120, 61, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("+");
			}
		});
		btnSuma.setBounds(10, 106, 41, 23);
		contentPane.add(btnSuma);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("-");
			}
		});
		btnResta.setBounds(60, 106, 41, 23);
		contentPane.add(btnResta);

		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("*");
			}
		});
		btnMultiplicacion.setBounds(110, 106, 41, 23);
		contentPane.add(btnMultiplicacion);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("/");
			}
		});
		btnDivision.setBounds(160, 106, 37, 23);
		contentPane.add(btnDivision);
		
		// Bot�n ra�z cuadrada.
		JButton btnRaizC = new JButton("Ra\u00EDz\u00B2");
		btnRaizC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("raiz");
			}
		});
		btnRaizC.setBounds(207, 106, 76, 23);
		contentPane.add(btnRaizC);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("CE");
			}
		});
		btnCE.setBounds(293, 106, 52, 23);
		contentPane.add(btnCE);
		
		chkPositivo = new JCheckBox("Positivo");
		chkPositivo.setForeground(Color.WHITE);
		chkPositivo.setBackground(Color.BLACK);
		chkPositivo.setBounds(231, 10, 97, 23);
		contentPane.add(chkPositivo);
		
		chkNegativo = new JCheckBox("Negativo");
		chkNegativo.setForeground(Color.WHITE);
		chkNegativo.setBackground(Color.BLACK);
		chkNegativo.setBounds(231, 35, 97, 23);
		contentPane.add(chkNegativo);
		
		chkNeutro = new JCheckBox("Neutro");
		chkNeutro.setForeground(Color.WHITE);
		chkNeutro.setBackground(Color.BLACK);
		chkNeutro.setBounds(231, 60, 97, 23);
		contentPane.add(chkNeutro);
		
		JRadioButton rdbtnSuma = new JRadioButton("+");
		rdbtnSuma.addItemListener(this);
		buttonGroup.add(rdbtnSuma);
		rdbtnSuma.setBounds(10, 158, 41, 23);
		contentPane.add(rdbtnSuma);
		
		JRadioButton rdbtnResta = new JRadioButton("-");
		rdbtnResta.addItemListener(this);
		buttonGroup.add(rdbtnResta);
		rdbtnResta.setBounds(65, 158, 30, 23);
		contentPane.add(rdbtnResta);
		
		JRadioButton rdbtnProd = new JRadioButton("*");
		rdbtnProd.addItemListener(this);
		buttonGroup.add(rdbtnProd);
		rdbtnProd.setBounds(110, 158, 41, 23);
		contentPane.add(rdbtnProd);
		
		JRadioButton rdbtnDiv = new JRadioButton("/");
		rdbtnDiv.addItemListener(this);
		buttonGroup.add(rdbtnDiv);
		rdbtnDiv.setBounds(160, 158, 37, 23);
		contentPane.add(rdbtnDiv);
		
		JLabel lblOperacin = new JLabel("Operaci\u00F3n");
		lblOperacin.setBounds(26, 212, 75, 14);
		contentPane.add(lblOperacin);
		
		JComboBox cmbOperaciones = new JComboBox();
		cmbOperaciones.setModel(new DefaultComboBoxModel(new String[] {"(Selecciona)", "+", "-", "*", "/"}));
		cmbOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOperaciones.getSelectedIndex()>0){
					calcularResultado((String)cmbOperaciones.getSelectedItem());
				}
			}
		});
		
		
		cmbOperaciones.setBounds(94, 209, 103, 20);
		contentPane.add(cmbOperaciones);
		
	}
	
	private void calcularResultado(String op) {
		DecimalFormat decimales = new DecimalFormat("#.###");
		double resul = 0;
		double num1 = 0;
		double num2 = 0;
		// coger valor num1
		try {
			num1 = Double.parseDouble(txtNumero1.getText());
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Debes introducir un entero");
			txtNumero1.requestFocus();
			txtNumero1.selectAll();
			return;
		}
		// coger valor num2
		try {
			num2 = Double.parseDouble(txtNumero2.getText());
		} catch (NumberFormatException nfe) {
			if(op=="raiz"){
				txtNumero2.setText(null);
			}else{
				JOptionPane.showMessageDialog(null, "Debes introducir un entero");
				txtNumero2.requestFocus();
				txtNumero2.selectAll();
				return;
			}
		
		}
		switch (op) {
		case "+":
			resul = num1 + num2;
			break;
		case "-":
			resul = num1 - num2;
			break;
		case "*":
			resul = num1 * num2;
			break;
		case "/":
			resul = num1 / num2;
			break;
		case "raiz":
			resul = Math.sqrt(num1);
			
			break;
		case "CE":
			// mostrar en todos vacio
			txtNumero1.setText("");
			txtNumero2.setText("");
			txtResultado.setText("");
			txtNumero1.requestFocus();
			break;
		}
		//Mostrar en txtResultado el resultado de las operaciones
		txtResultado.setText(decimales.format(resul));
		//actualizar la informacion de los checkBOx
		actualizarCheckBox(resul);
	}

	private void actualizarCheckBox(double resul) {
		chkPositivo.setSelected(false);
		chkNegativo.setSelected(false);
		chkNeutro.setSelected(false);
		if (resul > 0) {
			chkPositivo.setSelected(true);
		} else if (resul < 0) {
			chkNegativo.setSelected(true);
		} else {
			chkNeutro.setSelected(true);
		}		
	}
	public void itemStateChanged(ItemEvent arg0) {
		// arg0-->devuelve el elemento que ha creado ese evento
		JRadioButton rdbtnSel = (JRadioButton) arg0.getSource();
		if (rdbtnSel.isSelected()) {
			calcularResultado(rdbtnSel.getText());
		}
	}
}