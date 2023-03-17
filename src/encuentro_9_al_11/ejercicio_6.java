/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar
que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package encuentro_9_al_11;

import java.util.Scanner;


public class ejercicio_6 {

    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("------------- MATRIZ-MAGICA ----------------");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.println("Escribe un numero para la fila " + i + " Columna " + j);
                
                num = leer.nextInt();
                while(num > 9 || num < 1 ){
                    System.out.println("El numero debe estar entre 1 y 9");
                    System.out.println("Escribe un numero para la fila " + i + " Columna " + j);
                    num = leer.nextInt();
                }
                
                cuadrado[i][j] = num;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" " + cuadrado[i][j]);
                
            }
            System.out.println("");
        }
        
        if(cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2] == cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2] && cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2] == cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2]){
            
            System.out.println("Es una matriz magica");
            
        }else{
            System.out.println("No es una matriz magica");
        }
        
        
    }
    
}
