
package q1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaQ1 {

	private JFrame Conversor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String auxiliar = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaQ1 window = new TelaQ1();
					window.Conversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public TelaQ1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		Conversor Converter = new Conversor();
		
		Conversor = new JFrame();
		Conversor.setTitle("Conversor");
		Conversor.setBounds(100, 100, 450, 300);
		Conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Conversor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Quadrado");
		lblNewLabel.setBounds(77, 36, 170, 13);
		Conversor.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								

				textField.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				
				textField.getText();
				Converter.m2= Double.parseDouble(textField.getText());
				
				Converter.setPeQuadrado(Converter.m2);
				auxiliar = Double.toString(Converter.getPeQuadrado());
				textField_1.setText(auxiliar);
				
				Converter.setAcre(Converter.getPeQuadrado());
				auxiliar = Double.toString(Converter.getAcre());
				textField_2.setText(auxiliar);
				
				Converter.setCentimetrosQuadrados(Converter.p2);
				auxiliar = Double.toString(Converter.getCentimetrosQuadrados());
				textField_3.setText(auxiliar);
				
				textField.setEnabled(true);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				
			}
		});
		textField.setBounds(211, 33, 96, 19);
		Conversor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERTIDO PARA");
		lblNewLabel_1.setBounds(143, 80, 134, 13);
		Conversor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P\u00E9 Quadrado");
		lblNewLabel_2.setBounds(77, 124, 77, 13);
		Conversor.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Acre");
		lblNewLabel_3.setBounds(77, 147, 77, 13);
		Conversor.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cent\u00EDmetro Quadrado");
		lblNewLabel_4.setBounds(77, 170, 119, 13);
		Conversor.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 121, 154, 19);
		Conversor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(211, 144, 154, 19);
		Conversor.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(211, 167, 154, 19);
		Conversor.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
