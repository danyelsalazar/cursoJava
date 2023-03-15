/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados
por el usuario, validando que el primer número múltiplo del segundo e imprima 
si el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package Encuentro_7_8;

import java.util.Scanner;

public class guiaTeorica_eje_2 {

    public static void main(String[] args) {
        
        int num1, num2;
        System.out.println("Escriba el primer numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        
        System.out.println("Escriba el segundo numero");
        Scanner leerNum2 = new Scanner(System.in);
        num2 = leerNum2.nextInt();
        
        if(multiplo(num1,num2) == 1){
            System.out.println("El numero " + num1+ " es multiplo de " + num2);
        }else{
            System.out.println("El numero " + num1+ " no es multiplo de " + num2);
        }
        
    }
    
    public static int multiplo(int numero1, int numero2){
        int multiplo = 0;
        
        if(numero1 % numero2 == 0 ){
            multiplo = 1;
        }
        return multiplo;
    }
    
}
