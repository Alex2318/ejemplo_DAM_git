import Ventanas.Login;
import Ventanas.VentanaPrincipal;

public class Principal {//Apertura clase

	public static void main(String[] args) {//Apertura método main

		VentanaPrincipal vPrincipal=new VentanaPrincipal();
		
		Login login=new Login(vPrincipal);//Nuevo objeto ventana Login. Entre paréntesis input de ventana principal.
		login.setVisible(true);//Así lo hacemos visible
		


	}//Cierre método

}//Cierre clase
