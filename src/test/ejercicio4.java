//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package test;

import java.util.Scanner;


public class ejercicio4 {

    public static void main(String[] args) {
      
        System.out.println("¿Quentos grados centigrados?");
        Scanner transC = new Scanner(System.in);
        double gradosCen = transC.nextInt();
        
        //formula : f= 32 + (9 * C / 5)
        double conver = 32 + (9 * gradosCen / 5);
        System.out.println( gradosCen + "ºC son " + conver + "ºF" );
        
        
    }
    
}
