
public class SwingObjects {



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("BIENVENIDOS A MI PROGRAMA DE VENTANAS");
					VentanaPrincipal ventana = new VentanaPrincipal(); //Genera automáticamente objeto. Ejecuta constructor
					ventana.cambiarMsg("Álex probando");
					ventana.setVisible(true);
					ventana.setBounds(100, 100, 500, 312);
						}
		
		public SwingObjects() {
		
	}
}
