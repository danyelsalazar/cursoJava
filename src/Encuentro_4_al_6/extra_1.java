/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
calcular su equivalente: 1 día, 2 horas.

 */
package Encuentro_4_al_6;

import java.util.Scanner;


public class extra_1 {

    public static void main(String[] args) {
        
        System.out.println("Transformador de tiempo");
        System.out.println("Ingrese la cantidad en minutos");
        int opcionUser, dia, horas;
        Scanner leerOpcion = new Scanner(System.in);
        opcionUser = leerOpcion.nextInt();
        
        dia = opcionUser / 1440;
        horas = opcionUser / 60 ;
        System.out.println("Equivalente: " + dia + " dia, " + horas + " horas" );
        
        
    }
    
}
