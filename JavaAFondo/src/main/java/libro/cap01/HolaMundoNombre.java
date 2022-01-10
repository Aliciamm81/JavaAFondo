/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro.cap01;

/**
 *
 * @author Manu
 */
import java.util.Scanner;
public class HolaMundoNombre 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre edad altura: ");
        String nom = scanner.next();
        int edad= scanner.nextInt();
        double altura = scanner.nextDouble();
        System.out.println("Nombre: "+nom
                            +" Edad: "+edad
                            +" Altura: "+altura);
    }
}
