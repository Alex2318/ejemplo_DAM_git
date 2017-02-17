import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Imagenes extends JFrame {

	private JPanel contentPane;
	private JLabel lblEtiqueta;//Lo definimos aquí como variable para que sea extensible a toda la clase.

	/**
	 * Este es el main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagenes frame = new Imagenes();
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
	public Imagenes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblEtiqueta = new JLabel();
		try{//Inicio del control de excepciones.
		ImageIcon imagen=new ImageIcon(getClass().getResource("img/IMG_5866.JPG"));//Creamos el objeto imagen y con el metodo (getClass().getREsource("")) le metemos la imagen.
		lblEtiqueta.setIcon(imagen);//Método para incorporar una imagen a la etiqueta
		}catch (Exception e){//Introducimos la excepción
			System.out.println("LA IMAGEN NO EXISTE");//AL NOMBRE DE LA IMAGEN LE SOBRA EL 2
			System.out.println(e.getMessage());//Metodo para decir tipo de error
			e.printStackTrace();//Metodo para que salga error.
		}//Fin del control de excepciones.

		lblEtiqueta.setBounds(-90, -18, 1400, 1500);
		contentPane.add(lblEtiqueta);
	}
}
