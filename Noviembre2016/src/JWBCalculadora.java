import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JWBCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

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
		setBounds(100, 100, 300, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero1:");
		lblNumero.setBounds(52, 14, 83, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(52, 39, 66, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(52, 64, 66, 14);
		contentPane.add(lblResultado);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(120, 11, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(120, 39, 86, 20);
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
		btnResta.setBounds(58, 106, 41, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("*");
			}
		});
		btnMultiplicacion.setBounds(105, 106, 41, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("/");
			}
		});
		btnDivision.setBounds(159, 106, 37, 23);
		contentPane.add(btnDivision);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("CE");
			}
		});
		btnCE.setBounds(206, 106, 52, 23);
		contentPane.add(btnCE);
	}
	private void calcularResultado(String op){
		//coger valor num1
		int num1=Integer.parseInt(txtNumero1.getText());
		//coger valor num2
		int num2=Integer.parseInt(txtNumero2.getText());
		switch(op){
			case "+":
				int suma=num1+num2;
				//mostrar en txtResultado la suma
				txtResultado.setText(String.valueOf(suma));
				break;
			case "-":
				int resta=num1-num2;
				//mostrar en txtResultado la resta
				txtResultado.setText(String.valueOf(resta));
				break;
			case "*":
				int multiplicacion=num1*num2;
				//mostrar en txtResultado la multiplicacion
				txtResultado.setText(String.valueOf(multiplicacion));
				break;
			case "/":
				int division=num1/num2;
				//mostrar en txtResultado la division
				txtResultado.setText(String.valueOf(division));
				break;	
			case "CE":
				//mostrar en todos vacio
				txtNumero1.setText("");
				txtNumero2.setText("");
				txtResultado.setText("");
				txtNumero1.requestFocus();
				break;	
		}	
	}
}