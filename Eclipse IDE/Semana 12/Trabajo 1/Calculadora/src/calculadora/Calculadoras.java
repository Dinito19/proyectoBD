package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadoras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOperador1;
	private JTextField txtOperador2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadoras frame = new Calculadoras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void LlenarOperadores() throws Exception{
		if(txtOperador1.getText().isEmpty()) {
			throw new Exception("Debo ingresar el Operador 1");
		}
		
		if(txtOperador2.getText().isEmpty()) {
			throw new Exception("Debo ingresar el Operador 2");
		}
		calculadora.setOperador1(Integer.parseInt(txtOperador1.getText()));
		calculadora.setOperador2(Integer.parseInt(txtOperador2.getText()));
		
	}

	/**
	 * Create the frame.
	 */
	public Calculadoras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(214, 165, 10, 10);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Operador 1: ");
		lblNewLabel.setBounds(45, 52, 71, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operador 2: ");
		lblNewLabel_1.setBounds(45, 99, 71, 26);
		panel.add(lblNewLabel_1);
		
		txtOperador1 = new JTextField();
		txtOperador1.setBounds(126, 56, 108, 23);
		panel.add(txtOperador1);
		txtOperador1.setColumns(10);
		
		txtOperador2 = new JTextField();
		txtOperador2.setBounds(126, 99, 108, 23);
		panel.add(txtOperador2);
		txtOperador2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado: ");
		lblNewLabel_2.setBounds(45, 175, 71, 26);
		panel.add(lblNewLabel_2);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(126, 172, 108, 26);
		panel.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(298, 55, 85, 21);
		panel.add(btnModificar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(298, 86, 85, 21);
		panel.add(btnDividir);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(298, 116, 85, 21);
		panel.add(btnNewButton_2);
	}
}
