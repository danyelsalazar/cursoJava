/*
 Realizar un algoritmo que calcule la suma de todos los 
elementos de un vector de tamaño N, con los valores ingresados
por el usuario.

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class extra_1 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        int numUser, cont = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Escribe un numero para la columna " + i);
            numUser = leer.nextInt();
            vector[i] = numUser;
            cont = cont + vector[i];
        }
        System.out.println(cont);
    }
    
}
