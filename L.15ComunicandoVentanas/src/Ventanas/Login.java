package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private Login referencia;//Creamos una referencia a la ventana Login 
	private VentanaPrincipal vPrincipal;
	
	/**
	 * Create the frame.
	 */
	public Login(VentanaPrincipal vPrincipal) {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		referencia=this;//Aquí metemos la referencia para que lo que siga lo haga sobre Login
		
		JButton btnNewButton = new JButton("CERRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				referencia.dispose();//.dispose(); para cerrar ventana
			}
		});
		btnNewButton.setBounds(215, 227, 195, 23);
		contentPane.add(btnNewButton);
		
		JButton saltarVentana = new JButton("VENTANA PRINCIPAL>>");
		saltarVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vPrincipal.setVisible(true);
				referencia.setVisible(false);
			}
		});
		saltarVentana.setBounds(215, 193, 195, 23);
		contentPane.add(saltarVentana);
	}

}
