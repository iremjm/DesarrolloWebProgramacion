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
	private JTextField txtNum1;
	private JTextField txtNum2;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("N\u00FAmero 1");
		label1.setBounds(20, 39, 66, 14);
		label1.setBackground(Color.WHITE);
		contentPane.add(label1);

		JLabel label2 = new JLabel("N\u00FAmero 2");
		label2.setBounds(20, 64, 66, 14);
		contentPane.add(label2);

		JLabel label3 = new JLabel("Resultado");
		label3.setBounds(20, 89, 89, 14);
		contentPane.add(label3);

		txtNum1 = new JTextField();
		txtNum1.setBounds(96, 39, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);

		txtNum2 = new JTextField();
		txtNum2.setBounds(96, 64, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);

		txtResultado = new JTextField();
		txtResultado.setBounds(96, 89, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 = 0;

				numero1 = Integer.parseInt(txtNum1.getText());
				numero2 = Integer.parseInt(txtNum2.getText());
				int result = numero1 + numero2;

				txtResultado.setText(String.valueOf(result));
			}
		});

		btnSuma.setBounds(20, 146, 89, 23);
		contentPane.add(btnSuma);
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 = 0;

				numero1 = Integer.parseInt(txtNum1.getText());
				numero2 = Integer.parseInt(txtNum2.getText());
				int result = numero1 - numero2;

				txtResultado.setText(String.valueOf(result));
			}
		});
		btnResta.setBounds(119, 146, 89, 23);
		contentPane.add(btnResta);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 = 0;

				numero1 = Integer.parseInt(txtNum1.getText());
				numero2 = Integer.parseInt(txtNum2.getText());
				int result = numero1 * numero2;

				txtResultado.setText(String.valueOf(result));
			}
		});
		btnMulti.setBounds(218, 146, 89, 23);
		contentPane.add(btnMulti);
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 = 0;

				numero1 = Integer.parseInt(txtNum1.getText());
				numero2 = Integer.parseInt(txtNum2.getText());
				int result = numero1 / numero2;

				txtResultado.setText(String.valueOf(result));
			}
		});
		btnDiv.setBounds(317, 146, 89, 23);
		contentPane.add(btnDiv);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 = 0;
				int result = 0;

				txtResultado.setText(String.valueOf(result));
				txtResultado.setText(String.valueOf(numero1));
				txtResultado.setText(String.valueOf(numero2));


			}
		});
		btnCE.setBounds(177, 180, 89, 23);
		contentPane.add(btnCE);

		JButton btnHello = new JButton("Hello");
		btnHello.setBounds(177, 214, 89, 23);
		contentPane.add(btnHello);
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "OLAKASE!!!");
			}
		});

	}
}
