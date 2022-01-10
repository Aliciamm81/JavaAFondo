package PildorasInformaticas;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] mi_matriz = new int[5];
		 * 
		 * mi_matriz[0] = 5; mi_matriz[1] = 38; mi_matriz[2] = -15; mi_matriz[3] = 92;
		 * mi_matriz[4] = 71;
		 */

		int[] mi_matriz = { 5, 38, -15, 92, 71 };

		// .length indica que abarca toda la longitud de la matriz

		for (int i = 0; i < mi_matriz.length; i++) {

			System.out.println("valor del índice " + i + " = " + mi_matriz[i]);
		}

	}

}
