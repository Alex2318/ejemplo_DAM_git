import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanasYVariables extends JFrame {

	private JPanel contentPane;//DEFINIENDO EL CONTENEDOR
	private JTextField txtAlex;//DEFINIENDO LA CAJA
	private JTextField caja;

	/**
	 * LANZAR LA VENTANA
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasYVariables frame = new VentanasYVariables();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CONFIGURAR LA VENTANA
	 */
	public VentanasYVariables() {
		getContentPane().setLayout(null);
		
		String nombre="Alex";
		//CONFIGURACIÓN DE MI VENTANA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//CONFIGURACIÓN DE MI CONTENEDOR
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Configuración primera caja
		caja = new JTextField();
		caja.setBounds(10, 53, 86, 20);
		getContentPane().add(caja);
		caja.setColumns(10);
		caja.setText(nombre);
		
		//Configuración primera etiqueta
		JLabel lblNewLabel = new JLabel("Etiqueta");
		lblNewLabel.setBounds(10, 28, 46, 14);
		getContentPane().add(lblNewLabel);
		
		
	}
}
