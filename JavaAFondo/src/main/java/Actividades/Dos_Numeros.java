package Actividades;

//Importo el paquete javax.swing para utilizar la clase JOptionPane

import javax.swing.JOptionPane;

//Creo la clase 
public class Dos_Numeros {

	public static void main(String[] args) {
		// Creo dos variables para almacenar los números

		double Numero1;
		double Numero2;

		// Con JOptionPane solicito los dos números al usuario y con Double.parseDouble
		// indico que lo que se va a almacenar es de tipo double y no String.
		Numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
		Numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));

		// Creo el calculo de la multiplicación de los dos números guardados en las
		// variables.
		double resultado = Numero1 * Numero2;

		// Lo muestro al usuario con JOptionPane.
		JOptionPane.showMessageDialog(null, "el resultado de la multiplicación es" + " " + resultado);

	}

}
