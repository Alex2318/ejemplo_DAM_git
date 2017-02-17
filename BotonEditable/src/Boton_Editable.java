import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boton_Editable extends JFrame {

	private JPanel contentPane;
	private JTextField caja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boton_Editable frame = new Boton_Editable();
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
	public Boton_Editable() {
		//Propiedades ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//Propiedades contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja de texto 
		caja = new JTextField();
		caja.setEditable(false);
		caja.setBounds(10, 11, 414, 20);
		caja.setText("Ed\u00EDtame");
		contentPane.add(caja);
		caja.setColumns(10);
		
		//Botón
		JButton boton_hacer_editable = new JButton("Aprieta para editar la caja anterior");
		boton_hacer_editable.setBounds(10, 57, 414, 23);
		boton_hacer_editable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				caja.setEditable(true);//Introducimos el método setEditable dependiente de la acción de pulsar el botón
			}
		});
		contentPane.add(boton_hacer_editable);
	}
}
