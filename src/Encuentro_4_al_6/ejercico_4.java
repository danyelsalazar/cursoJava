/*
Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’,
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercico_4 {

    public static void main(String[] args) {
        String palabra, letra ;
        System.out.println("Escribe una palabra y te digo si la primera letra es una vocal");
        Scanner leerPalabra = new Scanner(System.in);
        
        palabra = leerPalabra.nextLine();
        
        //System.out.println(palabra.substring(0,2));
        
        if(palabra.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("Correcto");
            
        }else{
            System.out.println("incorrecto");
        
        }
        
    }
    
}
