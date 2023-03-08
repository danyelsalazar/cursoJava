//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package test;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre");
        Scanner leerNombre = new Scanner(System.in);
        String nombre = leerNombre.next();
        System.out.println("tu nombre es " + nombre);
         
    }
    
}
