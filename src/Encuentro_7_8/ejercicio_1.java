/*

Crea una aplicación que le pida dos números al usuario y 
este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. 

 */
package Encuentro_7_8;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        
        int num1, num2;
        
        System.out.println("Ingrese el primer numero");
        Scanner leerNum1 = new Scanner(System.in);
        num1 = leerNum1.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        Scanner leerNum2 = new Scanner(System.in);
        num2 = leerNum2.nextInt();
        
        System.out.println(operacion(num1,num2));
        
        
    }
    
    public static int operacion(int numero1, int numero2){
        
        int resultado = 0, opcionUser;
        
        System.out.println("¿Que operacion quieres realizar?");
        System.out.println("1 - Multiplicacion");
        System.out.println("2 - Division");
        System.out.println("3 - Suma");
        System.out.println("4 - Resta");
        
        Scanner leerOpcion = new Scanner(System.in);
        opcionUser = leerOpcion.nextInt();
        
        switch(opcionUser){
            case 1:
                resultado = numero1 * numero2;
            break;
            case 2 :
                resultado = numero1 / numero2;
            break;
            case 3:
                resultado = numero1 + numero2;
            break;
            case 4:
                resultado = numero1 - numero2;
            break;
            default:
                System.out.println("Operacion no encontrada");
        }
        
        return resultado;
    }
    
}
