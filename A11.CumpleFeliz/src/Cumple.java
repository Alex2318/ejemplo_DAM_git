
public class Cumple {

	private String nombre;//Almacenará el nombre de una persona.
	private int edad;//Almacenará la edad de la persona.
	private int dia;//Almacenará el día de nacimiento de una persona. (1-31)
	private int mes;//Almacenará el mes de nacimiento de una persona. (1-12)
	private int anyo;//Almacenará el año de nacimiento de una persona. (1930-2016)
	
	public Cumple(){
	
			
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia<1){
			this.dia = 1;
		}else if (dia>31){
			this.dia = 31;
		}else{
		this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes<1){
			this.mes = 1;
		}else if (mes>12){
			this.mes = 12;
		}else{
			this.mes = mes;
		}
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		if (anyo<1930){
			this.anyo = 1930;
		}else if (anyo>2016){
			this.anyo = 2016;
		}else{
		this.anyo = anyo;
		}
	}	
		

}
