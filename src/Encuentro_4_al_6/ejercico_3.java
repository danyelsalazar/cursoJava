/* 
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

*/
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercico_3 {

    
    public static void main(String[] args) {
        
        String palabra;
        
        System.out.println("Escribe una palabra de 8 letras");
        Scanner leerPalabra = new Scanner(System.in);
        
        palabra = leerPalabra.next();
        
        if(palabra.length() == 8){
            
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        
        }
    }
    
}
