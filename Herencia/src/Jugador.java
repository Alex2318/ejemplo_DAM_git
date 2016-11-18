
public class Jugador extends Personaje{//==Jugador va a heredar todo lo de personaje

	private int puntos=0;
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public void addPuntos(){
		this.puntos = this.puntos+1;
	}
	
		// TODO Auto-generated method stub
		
	
}
