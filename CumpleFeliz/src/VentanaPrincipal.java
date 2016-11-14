import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAnyo;
	private JTextField textMsg;
	private JButton btnGuardar;

	//Crear objeto cumple
	private Cumple cump;
	
	public VentanaPrincipal() {
		
	
		//Configuración ventana
		setTitle("CUMPLEA\u00D1OS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); //Layout absoluto
		
		//Etiqueta nombre
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 26, 46, 14);
		contentPane.add(lblNombre);
		
		//Etiqueta edad
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 66, 46, 14);
		contentPane.add(lblEdad);
		
		//Etiqueta día
		JLabel lblDia = new JLabel("D\u00EDa");
		lblDia.setBounds(10, 106, 46, 14);
		contentPane.add(lblDia);
		
		//Etiqueta mes
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(10, 146, 46, 14);
		contentPane.add(lblMes);
		
		//Etiqueta año
		JLabel lblAnyo = new JLabel("A\u00F1o");
		lblAnyo.setBounds(10, 186, 46, 14);
		contentPane.add(lblAnyo);
		
		//Cuadro de texto nombre
		textNombre = new JTextField();
		textNombre.setBounds(77, 26, 347, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		//Cuadro de texto edad
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(77, 66, 86, 20);
		contentPane.add(textEdad);
		
		//Cuadro de texto día
		textDia = new JTextField();
		textDia.setColumns(10);
		textDia.setBounds(77, 106, 86, 20);
		contentPane.add(textDia);
		
		//Cuadro de texto mes
		textMes = new JTextField();
		textMes.setColumns(10);
		textMes.setBounds(77, 146, 86, 20);
		contentPane.add(textMes);
		
		//Cuadro de texto año
		textAnyo = new JTextField();
		textAnyo.setColumns(10);
		textAnyo.setBounds(77, 186, 86, 20);
		contentPane.add(textAnyo);
		
		//Botón guardar
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cump.setNombre(textNombre.getText());
				String edadString=textEdad.getText();
				int edad=Integer.valueOf(edadString);
				cump.setEdad(edad);
				String diaString=textDia.getText();
				int dia=Integer.valueOf(diaString);
				cump.setDia(dia);
				String mesString=textMes.getText();
				int mes=Integer.valueOf(mesString);
				cump.setMes(mes);
				String anyoString=textAnyo.getText();
				int anyo=Integer.valueOf(anyoString);
				cump.setAnyo(anyo);
				
				//mostrar por ventana MSG
				System.out.println(cump.getNombre() + " tiene "+cump.getEdad() + " y los cumple el " +cump.getDia()+ " del "+ cump.getMes());
				textMsg.setText(cump.getNombre() + " tiene "+cump.getEdad() + " y los cumple el " +cump.getDia()+ " del "+ cump.getMes());
			}
		});
		btnGuardar.setBounds(10, 226, 414, 23);
		contentPane.add(btnGuardar);
		
		//Cuadro de texto deshabilitado
		textMsg = new JTextField();
		textMsg.setEnabled(false);
		textMsg.setBounds(10, 266, 414, 36);
		contentPane.add(textMsg);
		textMsg.setColumns(10);
		
		//Crearemos un nuevo cumple
		cump=new Cumple();
	}
}
