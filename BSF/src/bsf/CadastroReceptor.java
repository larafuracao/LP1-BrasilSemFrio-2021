package bsf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CadastroReceptor {

	private JFrame frmCadastroReceptor;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroReceptor window = new CadastroReceptor();
					window.frmCadastroReceptor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroReceptor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroReceptor = new JFrame();
		frmCadastroReceptor.setTitle("Cadastro Receptor");
		frmCadastroReceptor.setBounds(100, 100, 450, 300);
		frmCadastroReceptor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroReceptor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(185, 24, 46, 14);
		frmCadastroReceptor.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(166, 38, 86, 20);
		frmCadastroReceptor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(185, 69, 46, 14);
		frmCadastroReceptor.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 90, 86, 20);
		frmCadastroReceptor.getContentPane().add(textField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Roupas");
		chckbxNewCheckBox.setBounds(166, 117, 97, 23);
		frmCadastroReceptor.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxAgasalhos = new JCheckBox("Agasalhos");
		chckbxAgasalhos.setBounds(166, 143, 97, 23);
		frmCadastroReceptor.getContentPane().add(chckbxAgasalhos);
		
		JCheckBox chckbxCobertas = new JCheckBox("Cobertas");
		chckbxCobertas.setBounds(166, 169, 97, 23);
		frmCadastroReceptor.getContentPane().add(chckbxCobertas);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(163, 227, 89, 23);
		frmCadastroReceptor.getContentPane().add(btnNewButton);
	}
}
