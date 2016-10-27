import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConvirtiendoString extends JFrame {

	private JPanel contentPane;
	private JTextField edadJText;
	int edad, masa;
	String edadTxt;
	String masaTxt;
	private JLabel lblMasaCorporal;
	private JTextField masaJText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvirtiendoString frame = new ConvirtiendoString();
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
	public ConvirtiendoString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 11, 46, 14);
		contentPane.add(lblEdad);
		
		edadJText = new JTextField();
		edadJText.setBounds(10, 36, 281, 20);
		contentPane.add(edadJText);
		edadJText.setColumns(10);
		
		JButton btnConvetir = new JButton("Calcular");
		btnConvetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Convertimos edad (String)en un integer
				edadTxt=edadJText.getText();//Aunque parezca integer, edadJText es un string
				edad=Integer.valueOf(edadTxt);//Lo hemos convertido a un integer con el método Integer.valuOf()
				edad++;//Ahora con nuestro integer podemos utilizarlo para calculos, como por ejemplo sumarle uno (++).
				System.out.println("Edad "+edad);
				//Calcular la masa muscular
				masa=edad*2+10;
				masaTxt=String.valueOf(masa);//Convertimos el integer masa en String masaTxt para sacarlo por pantalla. Por pantalla solo salen String
				masaJText.setText(masaTxt);
			}
		});
		btnConvetir.setBounds(10, 67, 89, 23);
		contentPane.add(btnConvetir);
		
		lblMasaCorporal = new JLabel("Masa corporal");
		lblMasaCorporal.setBounds(10, 120, 76, 14);
		contentPane.add(lblMasaCorporal);
		
		masaJText = new JTextField();
		masaJText.setColumns(10);
		masaJText.setBounds(10, 156, 281, 20);
		contentPane.add(masaJText);
	}

}
