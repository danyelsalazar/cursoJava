/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        
        String palabra = " ";
        boolean positivo = true;
        
        //forma 1
        /*
        if(palabra.equalsIgnoreCase("eureka")){
            
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        
        }
        */
        //forma 2
        while(positivo){
            
             System.out.println("Escribe la contraseña");
             Scanner leerPalabra = new Scanner(System.in);
             
             palabra = leerPalabra.nextLine();
             
             if(palabra.equalsIgnoreCase("eureka")){
            
                 System.out.println("correcto");
                 positivo = false;
                 
             }else{
                 System.out.println("Incorrecto");
                 
        
            }
        
        }
    }
    
}
