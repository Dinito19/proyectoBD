package personal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class FormsPersonal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormsPersonal frame = new FormsPersonal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void Ingresar() {
		personal Persona = new personal();
		
	}
	public void manejoBotones(JPanel panel) {
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(42, 148, 85, 21);
		panel.add(btnIngresar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(149, 148, 85, 21);
		panel.add(btnLimpiar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(265, 148, 85, 21);
		panel.add(btnModificar);
	}
	
	public void manejoTextos(JPanel panel) {
		txtDni = new JTextField();
		txtDni.setBounds(118, 48, 96, 19);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(118, 82, 96, 19);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(118, 116, 96, 19);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
	}
	public void manejoEtiquetas(JPanel panel) {
		JScrollPane cmbPersonal = new JScrollPane();
		cmbPersonal.setBounds(21, 189, 361, 142);
		panel.add(cmbPersonal);
		
		table = new JTable();
		cmbPersonal.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(254, 47, 96, 21);
		panel.add(comboBox);
	}
	public void manejoOtros(JPanel panel) {
		JLabel lblDni = new JLabel("Dni :");
		lblDni.setBounds(52, 44, 56, 26);
		panel.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(52, 80, 56, 22);
		panel.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad ;");
		lblEdad.setBounds(52, 112, 56, 26);
		panel.add(lblEdad);
	}

	/**
	 * Create the frame.
	 */
	public FormsPersonal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		manejoBotones(panel);
		manejoTextos(panel);
		manejoEtiquetas(panel);
		manejoOtros(panel);
		
	}
}