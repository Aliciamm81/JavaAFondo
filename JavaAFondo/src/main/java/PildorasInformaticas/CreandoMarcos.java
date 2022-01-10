package PildorasInformaticas;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		// Llamo a la clase creada abajo de miMarco y la instancio

		miMarco2 marco3 = new miMarco2();

		// Para hacer visible el marco
		marco3.setVisible(true);

		// Indicamos que tiene que hacer la ventana cuando se cierre
		// Con esta constante:
		// EXIT_ON_CLOSE (defined in JFrame): Exit the application using the System exit
		// method. Use this only in applications

		marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//Creamos la clase con el constructor
class miMarco2 extends JFrame {

	public miMarco2() {

		// setSize(200, 200); Para el tamaño

		// setLocation(500, 300); Para la localización en pantalla

		// Con esto hacemos las dos cosas Size y Location:
		setBounds(400, 250, 500, 300);

		// setResizable(false); para que no deje cambiar ni mover la ventana

		// setExtendedState(6); para extender la pantalla

		setTitle("Mi ventana");

	}

}