
public class UsandoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generar dos variables string
		String s1="";
		String s2="�lex es un campe�n";
		
		//Imprimir por pantalla
		System.out.println("El String s2= "+s2);
		
		//Igualar
		System.out.println("Longitud de s1= "+s1.length() );
		if (s1.length()==0){
			System.out.println("El String s1 est� vacio");
		}
		s1=s2;
		System.out.println("El String s1= "+s1);
		
		//Modificar
		s1=s1+" es un campe�n.";
		System.out.println("El String s1= "+s1);
		System.out.println("El String s2= "+s2);
		System.out.println("Longitud de s1= "+s1.length() );
		
		/*
		*String literal frente a String objeto.
		*String literal es lo que hemos hecho al ppio. esto es String objeto.
		*/
		String s3=new String("Nombre");
		String s4=new String("Nombre");
		
		s1=s2;
		System.out.println("El String s1= "+s1);
		System.out.println("El String s2= "+s2);
		System.out.println("El String s3= "+s3);
		System.out.println("El String s4= "+s4);
		if(s1==s2){
			System.out.println(" s1 = s2 ");
		}
		if (s3==s4){
			System.out.println(" s3 = s4 ");//No se va a imprimir ya que son objetos totalmente diferentes (String objeto).
		}
		if (s3.compareTo(s4)==0){//Hacemos lo de igual a 0, ya que este metodo devuelve la diferencia, entonces si la diferencia es igual a 0, son iguales.
			System.out.println(" s3 y s4 sus contenidos son iguales.");
		}

		//Otos m�todos
		System.out.println(s1.toLowerCase());//A minusculas
		System.out.println(s1.toUpperCase());//A may�sculas
		System.out.println(s1.charAt(0));//Te saca solo el chart que le pidas
		System.out.println(s1.length());//Mide el String
		System.out.println(s1.substring(0, 6));//Particiona el String de un punto a otro. En este caso de la posici�n 0 a la 6.
		System.out.println(s1.hashCode());//Tipo de c�digo de Java

	}//Cierre del main

}//Cierre de la clase
