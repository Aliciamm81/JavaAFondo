package Redondear;

import java.util.Scanner;

public class Redondear {

	public static void main(String[] args) {
		// TODO Auto-generated method Stub
		Scanner scKeyboard = new Scanner(System.in);
		double dNumber;
		int iRedondeado;
		System.out.println("Introduce un numero");
		dNumber = scKeyboard.nextDouble();
		System.out.println(dNumber);
		//
		long iRedondeadoL = Math.round(dNumber);
		System.out.println(iRedondeadoL);
		// Obligar a esta variable para que sea de tipo entero (casting)
		iRedondeado = (int) dNumber;
		System.out.println(iRedondeado);
		scKeyboard.close();
	}

}
