/*
 Escriba un programa que averigüe si dos vectores de N enteros 
son iguales (la comparación deberá detenerse en cuanto se detecte 
alguna diferencia entre los elementos).

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class extra_2 {

    public static void main(String[] args) {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int num;
        Scanner leer = new Scanner(System.in);
        
        
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] =  (int)(Math.random()*10);
        }
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(" " + vector1[i]);
        }
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Escribe un numero para la columna " + i);
            num = leer.nextInt();
            vector2[i] = num;
        }
        
        for (int i = 0; i < 4; i++) {
            
            if(vector1[i] == vector2[i]){
                System.out.println("Los valores son los mismos en la columna " + i);
            }else{
                break;
            }  
        }
        
        
    }
    
}
