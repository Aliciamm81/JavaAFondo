/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author Manu
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("ingrese un valor: ");
       int v = scanner.nextInt();
       int resto = v % 2;
       if(resto == 0)
       {
           System.out.println(v+"es Par");
       }
       else
       {    System.out.println(v+"es Impar");
       }
    
    }
   
}
