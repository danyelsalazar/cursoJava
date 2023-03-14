/*
 Elaborar un algoritmo en el cuál se ingrese una letra
y se detecte si se trata de una vocal. Caso contrario mostrarun mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package Encuentro_4_al_6;

import java.util.Scanner;


public class extra_3 {

   
    public static void main(String[] args) {
        String letra;
        System.out.println("Ingrese una vocal");
        Scanner leerLetra = new Scanner(System.in);
        letra = leerLetra.next();
        
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":    
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("no es una vocal");
        }
    }
    
}
