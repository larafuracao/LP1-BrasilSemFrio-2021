package bsf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDoador {

	private JFrame frmCadastroDoador;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDoador window = new CadastroDoador();
					window.frmCadastroDoador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroDoador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDoador = new JFrame();
		frmCadastroDoador.setTitle("Cadastro Doador");
		frmCadastroDoador.setBounds(100, 100, 450, 300);
		frmCadastroDoador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDoador.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(152, 29, 46, 14);
		frmCadastroDoador.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(128, 42, 86, 20);
		frmCadastroDoador.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(168, 227, 89, 23);
		frmCadastroDoador.getContentPane().add(btnNewButton);
		
		JLabel lblCpfOuCnpj = new JLabel("CPF  ou CNPJ");
		lblCpfOuCnpj.setBounds(128, 73, 70, 14);
		frmCadastroDoador.getContentPane().add(lblCpfOuCnpj);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 84, 86, 20);
		frmCadastroDoador.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1_1.setBounds(257, 73, 46, 14);
		frmCadastroDoador.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 147, 86, 20);
		frmCadastroDoador.getContentPane().add(textField_2);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(257, 29, 46, 14);
		frmCadastroDoador.getContentPane().add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(234, 42, 86, 20);
		frmCadastroDoador.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Login");
		lblNewLabel_2_1.setBounds(193, 125, 46, 14);
		frmCadastroDoador.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Senha");
		lblNewLabel_2_2.setBounds(193, 178, 46, 14);
		frmCadastroDoador.getContentPane().add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(234, 84, 86, 20);
		frmCadastroDoador.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(171, 193, 86, 20);
		frmCadastroDoador.getContentPane().add(textField_5);
	}
}
