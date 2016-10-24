
//La definición de la clase mediante la palabra reservada Carta.
//Public class NOMBRE DE LA CLASE
public class Carta {
	
	//PROPIEDADES O VARIABLES
	private int numero;
	private String palo;
	
	//CONSTANTES
	public static final String BASTOS="BASTOS";
	public static final String COPAS="COPAS";
	public static final String ESPADAS="ESPADAS";
	public static final String OROS="OROS";

	//Constructor
	//Punto de entrada que se ejecuta al crear un objeto de tipo Carta
	public Carta() {
		System.out.println("Creo un objeto de tipo Carta");
	}
	
	//FUNCIÓN O MÉTODO
	//public/private quéSaca nombreMetodo(quéEntra)
	//public/private OUT nombreMetodo (IN)
	public void setNumero(int numero){
		//Si pasa algo haz...
		if(numero<1){
			this.numero=1;
		}else if (numero>12){
			this.numero=12;
		}else{
			this.numero=numero;
		}
	}
	public int getNumero(){  //el método get hace lo comtrario que set, no entra nada (paréntesis vacios) y saca un int.
		return numero;
	}
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;//para distinguir el palo de la clase del palo del método
	}


}
