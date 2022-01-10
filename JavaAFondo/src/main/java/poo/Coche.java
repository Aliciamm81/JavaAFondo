package poo;

//Esta es la construcción de la clase
public class Coche {

	// Características comunes que no cambian
	private int ruedas; // Se encapsula con el modificador private
	private int ancho;
	private int largo;
	private int motor;
	private int peso_plataforma;

	// Características comunes que cambian
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

		/*
		 * SE PODRÍA PONER TODO EN ESTE FICHERO SIN NECESIDAD DE CREAR LA CLASE
		 * Uso_Coche PERO ES MEJOR TENERLO SEPARADO POR FICHEROS PARA LA MODULARIZACION.
		 * public static void main(String[] args) { Coche Renault = new Coche(); //
		 * Instanciar una clase. Ejemplar de clase
		 * System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		 */
	}
	// Método GETTERS para poder consultar cuantas ruedas tiene el coche desde las
	// clases

	public String dime_ruedas() { // Método GETTERS para poder consultar cuantas ruedas tiene el coche desde las
									// clases

		return "El coche tiene" + " " + ruedas + " " + "ruedas";

	}

	public void establece_color() { // Método SETTERS para poder modificar el color del coche

		color = "azul";

	}

	public String dime_color() {

		return "El color del coche es" + " " + color + " ";
	}

}
