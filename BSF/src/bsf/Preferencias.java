package bsf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class Preferencias {

	private JFrame frmP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preferencias window = new Preferencias();
					window.frmP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Preferencias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmP = new JFrame();
		frmP.setTitle("DEFINIR PREFER\u00CANCIA");
		frmP.setBounds(100, 100, 450, 300);
		frmP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmP.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Definir");
		btnNewButton.setBounds(157, 227, 89, 23);
		frmP.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Roupa");
		chckbxNewCheckBox.setBounds(157, 71, 97, 23);
		frmP.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Agasalho");
		chckbxNewCheckBox_1.setBounds(157, 97, 97, 23);
		frmP.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cobertor");
		chckbxNewCheckBox_2.setBounds(157, 123, 97, 23);
		frmP.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("Casa Santa Maria");
		lblNewLabel.setBounds(10, 11, 121, 14);
		frmP.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preferência");
		lblNewLabel_1.setBounds(157, 50, 121, 14);
		frmP.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(157, 171, 89, 45);
		frmP.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1_1 = new JLabel("Observações");
		lblNewLabel_1_1.setBounds(157, 153, 121, 14);
		frmP.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Av. Maria do Carmo, 43");
		lblNewLabel_2.setBounds(10, 36, 121, 23);
		frmP.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("São Paulo");
		lblNewLabel_2_1.setBounds(10, 71, 126, 23);
		frmP.getContentPane().add(lblNewLabel_2_1);
		
	
	}

}
