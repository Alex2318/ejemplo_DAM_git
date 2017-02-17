
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generar un nuevo jugador
		Jugador player1=new Jugador();
		
		player1.setPuntos(10);
		player1.setArmaActual("Espada");
		
		//Generar un mounstro
		Monstruo ogro=new Monstruo();
		ogro.setTipoAtaque("hachazo");
		ogro.setVida(5);
		
		//Definimos un personaje de forma general
		Personaje personaje21=new Personaje();
		personaje21.setNivel(3);
		personaje21.setVida(100);
		
	}

}
