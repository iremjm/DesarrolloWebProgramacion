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

public class JCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField JtxtNum1;
	private JTextField JtxtNum2;
	private JTextField jtxtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCalculadora frame = new JCalculadora();
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
	public JCalculadora() {
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
		
		JtxtNum1 = new JTextField();
		JtxtNum1.setBounds(96, 39, 86, 20);
		contentPane.add(JtxtNum1);
		JtxtNum1.setColumns(10);
		
		JtxtNum2 = new JTextField();
		JtxtNum2.setBounds(96, 64, 86, 20);
		contentPane.add(JtxtNum2);
		JtxtNum2.setColumns(10);
		
		jtxtResultado = new JTextField();
		jtxtResultado.setBounds(96, 89, 86, 20);
		contentPane.add(jtxtResultado);
		jtxtResultado.setColumns(10);
		
		JButton JButtonSum = new JButton("+");
		JButtonSum.addActionListener(new ActionListener() {
			private Object JtxtNum1;
			private Object JtxtNum2;

			public void actionPerformed(ActionEvent e) {
				int numero1 = 0;
				int numero2 =0;
				
				numero1 = Integer.parseInt( this.JtxtNum1).getText();	
				numero2 = Integer.parseInt(this.JtxtNum2).getText();	
				int result= numero1+numero2;
				
				jtxtResultado.setText(String.valueOf(result));
			}
		});
		JButtonSum.setBounds(20, 146, 89, 23);
		contentPane.add(JButtonSum);
		
		JButton JButtonRes = new JButton("-");
		JButtonRes.setBounds(119, 146, 89, 23);
		contentPane.add(JButtonRes);
		
		JButton JButtonMult = new JButton("*");
		JButtonMult.setBounds(218, 146, 89, 23);
		contentPane.add(JButtonMult);
		
		JButton JButtonDiv = new JButton("/");
		JButtonDiv.setBounds(317, 146, 89, 23);
		contentPane.add(JButtonDiv);
		
		JButton JButtonReset = new JButton("CE");
		JButtonReset.setBounds(177, 180, 89, 23);
		contentPane.add(JButtonReset);
		
		JButton JButtonHello = new JButton("Saluda");
		JButtonHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "OLAKASE!!!");
			}
		});
		JButtonHello.setBounds(177, 214, 89, 23);
		contentPane.add(JButtonHello);
	}
}               //https://www.youtube.com/watch?v=y36lG9qJyno
