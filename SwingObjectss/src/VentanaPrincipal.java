import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	//Layout (Ventana)
	private JPanel contentPane;
	private JTextField txtForm;
	private JTextField textMsg;
	private JTextArea textArea;
	private JButton btnComprobacion;
	private JLabel etiquetaNombre;
	
	public VentanaPrincipal () {
		
		//Métodos necesarios para lanzar nuesta ventana
	
			//Método a la hora de cerrar ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Dimensiones de la ventana
			setBounds(100, 100, 500, 312);
			//Añadimos un Layout (contenedor)
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			//Lo añadimos al JFrame (depende del JFrame)
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//Nuestra primera etiqueta
			etiquetaNombre = new JLabel("Nombre");
			etiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaNombre.setFont(new Font("Arial", Font.BOLD, 11));
			etiquetaNombre.setBounds(10, 11, 46, 14);
			//Añadirle texto
			etiquetaNombre.setText("Álex");
			//Añado etiqueta aal contentPane
			contentPane.add(etiquetaNombre);
			
			//Nuevo JtextField
			txtForm = new JTextField();
			txtForm.setText("Escribe algo");
			txtForm.setBounds(10, 61, 464, 20);
			contentPane.add(txtForm);
			txtForm.setColumns(10);
			
			//Nuevo texto de mensaje
			textMsg = new JTextField();
			textMsg.setEnabled(false);
			textMsg.setColumns(10);
			textMsg.setBounds(10, 242, 464, 20);
			textMsg.setText("Nuevo mensaje de texto");
			textMsg.setEnabled(true);
			contentPane.add(textMsg);
			
			//Nuevo Botón
			btnComprobacion = new JButton("Comprobar");
			//Evento addActionListener, añade un oyente para cualquier opción que realiza la acción
			btnComprobacion.addActionListener(new ActionListener() {
				//Qué hacemos cuando nos llega un evento?
				public void actionPerformed(ActionEvent arg0) {
					//Si no hay contenido en txtForm... (if (txtForm.sacamos texto().longitud(mide)()==0)
					if(txtForm.getText().length()==0){
						//...saldrá esto (.setText):
						textMsg.setText("No hay contenido");
					}else{
						textMsg.setText("Hay contenido");
					}
				}
			});
			btnComprobacion.setBounds(10, 118, 218, 23);
			contentPane.add(btnComprobacion);
			
			//Nuevo Text Area
			textArea = new JTextArea();
			textArea.setBounds(10, 152, 464, 78);
			contentPane.add(textArea);
			
		}
	
	//MEtodo
	public void cambiarMsg (String msg){
		textMsg.setText(msg);
	}
	
	}
	


