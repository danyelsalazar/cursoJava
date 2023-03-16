/*
 Realizar un algoritmo que llene un vector de tamaño N 
con valores aleatorios y le pida al usuario un número a
buscar en el vector. El programa mostrará dónde se encuentra
el numero y si se encuentra repetido

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        int [] vector = new int[20];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
        
        System.out.println(vector[19]);
        
        int num;
        System.out.println("que numero quieres buscar");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num){
                System.out.println("El numero se encuentra en la posicion: " + i);
                cont++;
            }
        }
        switch (cont) {
            case 1:
                System.out.println("El numero no se repite");
                break;
            case 0:
                System.out.println("El numero no esta en el vector");
                break;
            default:
                System.out.println("El numero se repite");
                break;
        }
    }
    
}
