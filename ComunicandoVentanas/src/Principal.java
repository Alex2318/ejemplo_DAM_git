import Ventanas.Login;
import Ventanas.VentanaPrincipal;

public class Principal {//Apertura clase

	public static void main(String[] args) {//Apertura m�todo main

		VentanaPrincipal vPrincipal=new VentanaPrincipal();
		
		Login login=new Login(vPrincipal);//Nuevo objeto ventana Login
		login.setVisible(true);//As� lo hacemos visible
		


	}//Cierre m�todo

}//Cierre clase
