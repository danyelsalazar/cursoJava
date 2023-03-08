//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

package test;

import java.util.Scanner;

public class bienvenida {
    public static void main(String[] args) {
        //aqui adentro va todo el codigo
        
        System.out.println("hola soy danyel ");
       
      
        System.out.println("escribe un numero entero");
        Scanner leer = new Scanner(System.in);
        int num;
        num = leer.nextInt();
        System.out.println("el numero es: " + num);
        
        String nombre = "Danyel";
        String apellido = "Salazar";
               
        System.out.println("Bienvenido " + nombre + " " + apellido);
    }
    
}
