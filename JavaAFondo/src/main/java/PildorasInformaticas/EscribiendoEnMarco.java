package PildorasInformaticas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// 1 - Creamos el marco con una clase y sus métodos
		// 2 - Instanciamos la clase creada

		MarcoConTexto mimarco = new MarcoConTexto();
		// 3 - Que hace nuestro marco cuando lo cerramos

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//1 - Para crear el marco y sus métodos
class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setVisible(true);

		setSize(600, 450);

		setLocation(400, 200);

		setTitle("primer texto");

		// 7 - Agregar la lámina

		MiLamina Lamina = new MiLamina();

		// 8 - Para ponerla por encima

		add(Lamina);
	}

}

// 4 - Creamos una clase que herede de JPanel

class MiLamina extends JPanel {

	@Override
	public void paintComponent(Graphics g) {

		// 5 - Invocar un metodo de la clase padre (JComponent)con esta insturcción
		// podemos usar todos los métodos
		super.paintComponent(g);

		// 6 - Dibujar un texto
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}

}