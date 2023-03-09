/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class guiaTeorica_ej_5 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0 , num4 = 0;
        int cont = 0;
        
        System.out.println("escribe 4 numeros uno por uno");
        
        do{
            
            Scanner numeros = new Scanner(System.in);
            
            if(num1 == 0){
                num1 = numeros.nextInt();
            }
            
            if(num2 == 0){
                num2 = numeros.nextInt();
            }
            
            if(num3 == 0){
                num3 = numeros.nextInt();
            }
            
            if(num4 == 0){
                num4 = numeros.nextInt();
            }
            
            cont++;
        
        }while(cont <= 4);
        
        
        System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(num2 + " ");
        
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(num3 + " ");
        
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(num4 + " ");
        
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
}
