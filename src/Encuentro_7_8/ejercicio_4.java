/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */
package Encuentro_7_8;

import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {
        
        int num;
        System.out.println("Escribe un numero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        System.out.println(numPrimo(num));
        
        
    }
    
    public static boolean numPrimo(int numero){
        boolean validacion = false;
        int cont = 0;
        
        for (int i = 1; i < numero+1; i++) {
            
            if(numero % i == 0){
                cont++;
            }
            
        }
        
        if(cont == 2){
            validacion = true;
        }
        
        return validacion;
    }
    
}
