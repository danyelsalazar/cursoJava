//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

package Encuentro_4_al_6;

import java.util.Scanner;

public class guiaTeorica {
    public static void main(String[] args) {
        
        System.out.println("El programa indicara entre dos si son o cual es mayor a 25");
        System.out.println("Escribe el primer numero");
        Scanner num1 = new Scanner(System.in);
        System.out.println("Escribe el segundo numero");
        Scanner num2 = new Scanner(System.in);
        
        int numero1 = num1.nextInt();
        int numero2 = num2.nextInt();
        
        if(numero1 > 25 && numero2 > 25){
            
            System.out.println("Los dos numeros son mayores a 25");
            
        }else{
            
             if(numero1 < 25){
                 
             System.out.println("el numero " + numero1 + " es menor a 25");
             
             }else{
                 
                  System.out.println("El numero " + numero1 + " es mayor a 25");
             }
             
             if(numero2 < 25){
                 
                  System.out.println("el numero " + numero2 + " es menor a 25");
             
             }else{
                 
                  System.out.println("El numero " + numero2 + " es mayor a 25");
             
             }
        }
        
    }
    
    
}
