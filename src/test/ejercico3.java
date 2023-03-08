//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

package test;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ejercico3 {

    public static void main(String[] args) {
        System.out.println("Escribe una frase");
        Scanner frase = new Scanner(System.in);
        String fraseConv = frase.nextLine();
        // podemos vonvertir la frase de dos formas: 
        //forma uno:
        System.out.println("minuscula: " + toLowerCase(fraseConv) + " Mayuscula: " + toUpperCase(fraseConv));
        // forma dos: de esta forma no hay que importar archivos
        System.out.println(fraseConv.toLowerCase());
        System.out.println(fraseConv.toUpperCase());
                
    }
    
}
