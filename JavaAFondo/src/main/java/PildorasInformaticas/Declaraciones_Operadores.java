/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PildorasInformaticas;

/**
 *
 * @author Manu
 */
public class Declaraciones_Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a=5;//variable declarada e iniciada
        
        double b;// variable declarada pero no iniciada
        
        b=7; // variable b iniciada
        
        double c=b/a;
        
        c++; //incrementar 
        
        System.out.println(c);
        
        //declaración de una constante
        
        final double apulgadas=2.54; 
        
        double cm=6;
        
        double resultado=cm/apulgadas;
        
        System.out.println("En "+ cm + "cm hay " + resultado + " pulgadas");
        
        //Declarar variables en la misma línea y después iniciarlas
        
        int operador1,operador2,resultado2;
        
        operador1=9;
        
        operador2=7;
        
        resultado2=operador1+operador2;
        
        System.out.println(resultado2);
    }
    
}
