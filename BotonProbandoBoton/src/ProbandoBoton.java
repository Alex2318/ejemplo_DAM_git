import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ProbandoBoton extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JButton Boton2;
	private JTextField caja2;

	/**
	 * Punto de entrada a nuestra app
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbandoBoton frame = new ProbandoBoton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor o configuración de la ventana
	 */
	public ProbandoBoton() {
		//Marco y contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botón
		JButton Boton = new JButton("APRI\u00C9TAME!!");
		//Listener + Evento
		//---------
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Acción a desarrollar
				caja.setText("Mensaje cuando aprieto");
			}
		});
		//--------
		Boton.setBounds(10, 35, 111, 23);
		contentPane.add(Boton);
		
		//Mi caja de texto
		caja = new JTextField();
		caja.setBounds(10, 89, 212, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		//sEGUNDO BOTÓN
		Boton2 = new JButton("C\u00D3MEME!!!");
		
		//Listener+Evento2
		//---------
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja2.setText(caja.getText());
			}
		});
		//-----------
		Boton2.setBounds(10, 140, 111, 23);
		contentPane.add(Boton2);
		
		
		
		//Segunda caja
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(10, 208, 212, 20);
		contentPane.add(caja2);
		
		
	}
}
