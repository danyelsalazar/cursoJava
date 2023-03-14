/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
y se muestre su equivalente en romano.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class extra_4 {

    
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero del 1 al 10");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        switch(num){
            case 1:
                System.out.println("El numero en somanos es: I");
            break;
            case 2:
                System.out.println("El numero en somanos es: II");
            break;
            case 3:
                System.out.println("El numero en somanos es: III");
            break;
            case 4:
                System.out.println("El numero en somanos es: IV");
            break;
            case 5:
                System.out.println("El numero en somanos es: V");
            break;
            case 6:
                System.out.println("El numero en somanos es: VI");
            break;
            case 7:
                System.out.println("El numero en somanos es: VII");
            break;
            case 8:
                System.out.println("El numero en somanos es: VIII");
            break;
            case 9:
                System.out.println("El numero en somanos es: IX");
            break;
            case 10:
                System.out.println("El numero en somanos es: X");
            break;
            default:
                System.out.println("Numero invalido");
        }
    }
    
}
