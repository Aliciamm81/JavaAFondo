/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividades;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonaHoraria {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Para declarar la variable de la zona horaria
        ZoneId zId = ZoneId.of("America/Sao_Paulo");
        //Para consultar la hora de la zona declarada
        ZonedDateTime zoneDt = ZonedDateTime.now(zId);
        //Para que lo imprima en la consola
        System.out.println("Hola son las " + zoneDt.getHour()+":"+zoneDt.getMinute()
                +" en "+zoneDt.getZone());
 
    } 
}
