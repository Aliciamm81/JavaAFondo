package PildorasInformaticas;

import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Alicia";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

			if (clave.equals(pass) == false) {

				System.out.println("Contraseña incorrecta");

			}

		}

		System.out.println("Contraseña correcta.Acceso permitido");

	}

}
