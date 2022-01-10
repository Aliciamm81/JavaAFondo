package poo;
//Esta es la construcción de un objeto respecto de la clase Coche que hemos creado

public class Uso_Coche {

	public static void main(String[] args) {

		Coche Renault = new Coche(); // Instanciar una clase. Ejemplar de clase

		System.out.println(Renault.dime_ruedas());// usamos el método Getter para obtener el valor

		// Vamos a modificar el color del coche Renault

		Renault.establece_color();

		System.out.println(Renault.dime_color());

	}

}
