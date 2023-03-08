//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

package test;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
       
        System.out.println("Escribe un numero entero");
        Scanner leerNum = new Scanner(System.in);
        
        int num = leerNum.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raizCua = sqrt(num);
        
        System.out.println("el doble es: " + doble + " El triple es: " + triple + " La raiz cuadrada es: " + raizCua );
        
    }
    
}
