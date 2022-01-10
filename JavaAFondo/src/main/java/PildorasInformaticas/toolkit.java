package PildorasInformaticas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;

public class toolkit {

	public static void main(String[] args) {

		// Instanciar el marco creado
		miMarco marco1 = new miMarco();

		// Hacer visible el marco
		marco1.setVisible(true);

		// Que hacer cuando se cierre
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Para pedir el numero 1 por pantalla
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		int number1 = scanner.nextInt();

		// Para pedir el numero 2 por pantalla
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Ingrese el segundo valor: ");
		int number2 = scanner1.nextInt();

		// variable para calcular la suma
		int resultado = number1 + number2;

		// Para imprimir por pantalla el resultado de la suma
		System.out.println("la suma es: " + resultado);

	}

}
//Para crear el marco 

class miMarco extends JFrame {

	public miMarco() {

		// Para centrar el marco en la pantalla

		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = mipantalla.getScreenSize();

		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		// para darle tamaño a la ventana
		setSize(anchoPantalla / 2, alturaPantalla / 2);

		// para centrarlo en la pantalla
		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		// Para cambiar el título
		setTitle("Calcular suma");
		// Para que no se puede redimensionar
		setResizable(false);

	}

}
