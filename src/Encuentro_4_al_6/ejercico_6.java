/*
 Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercico_6 {

   
    public static void main(String[] args) {
        
        int num1, num2;
        
        System.out.println("Escribe dos numero enteros positivos para ir al menu y elejir la operacion");
        Scanner leerNum1 = new Scanner(System.in);
        Scanner leerNum2 = new Scanner(System.in);
        
        num1 = leerNum1.nextInt();
        num2 = leerNum2.nextInt();
        String salir = "";
        
        while(num1 > 0 && num2 > 0 && !"S".equalsIgnoreCase(salir) ){
            
            int opcUser;
            
            System.out.println("---------------------- MENU ------------------");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija una opcion:");
            
            Scanner leerOpc = new Scanner(System.in);
            opcUser = leerOpc.nextInt();
            
            switch(opcUser){
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                break;
                
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                break;
                
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                break;
                
                case 4:
                    System.out.println("La division de los numeros es " + (num1 / num2));
                break;
                
                case 5: 
                    System.out.println("¿Estas seguro de que quieres salir del programa?");
                    System.out.println("Escribe S para salir o N para volver al menu principal ");
                    Scanner leerSalida = new Scanner(System.in);
                    salir = leerSalida.next();
            
            }
        
        }
        
        
    }
    
}
