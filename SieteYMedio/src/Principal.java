import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {
	//Variables o propiedades.
	private JPanel contentPane;

	//La entrada a nuestro programa.
	//Método main.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor.
	 */
	
		//Las propiedades de nuestra ventana
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Nuestro código.Vamos a crear un objeto de la clase carta, con lo cual hará una llamada al constructor.
		//tipo nombreVariable= new tipo();
		Carta sieteBastos=new Carta();
		sieteBastos.setNumero(-1);//Aunque la variable numero sea privada al hacer una llamada al metodo (público) con el seter, me aparece.
		sieteBastos.setPalo(Carta.BASTOS);
		System.out.println("Tengo una carta que es el "+ sieteBastos.getNumero() + " de "+ sieteBastos.getPalo()) ; //En el print metemos el getter
		
		/* ESTO ESTÁ COMENTADO
		 * ************
		Carta unoOros=new Carta();
		unoOros.numero=1;
		unoOros.palo="OROS";
		System.out.println("Tengo una carta que es el "+ unoOros.numero + " de "+ unoOros.palo) ;

		Carta c1=new Carta();
		c1.numero=12;
		c1.palo="COPAS";
		System.out.println("Tengo una carta que es el "+ c1.numero + " de "+ c1.palo) ;
		************************
		*/		
	}
	
		

}
