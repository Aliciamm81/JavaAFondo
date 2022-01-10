/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PildorasInformaticas;

/**
 *
 * @author Manu
 */
public class Calculos_conMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double raiz=Math.sqrt(9);
        
        System.out.println(raiz);
        
        /*Refundición convertir un tipo de dato en otro
        int raiz=(int)Math.round(num1);
        */
         double num1=5.85;
         
        /* este método devolvería un dato de tipo long 
            "int resultado=Math.round(num1);
            y como la declaración la hicimos par aun tipo de dato entero
            todo esto daría error" solución poner un (int) delante de Math*/
            
         int resultado=(int)Math.round(num1);
         
         System.out.println(resultado);
         
    }
    
}
