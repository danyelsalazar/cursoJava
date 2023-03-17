/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] anti = new int[3][3];
        int cont , contPlus = 0;
        Scanner leer = new Scanner(System.in);
        
        //asignamos valores random a la matriz principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("----------------------"); 
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Escribe un valor para la fila " + i + " columna " + j);
                cont = leer.nextInt();
                anti[i][j] = cont;
                
                if(-matriz[j][i] == anti[i][j]){
                     contPlus++;
               
                }
            
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" " + anti[i][j]);
                
            }
            System.out.println("");
            
        }
       
        
        //mostramos la matriz creada
        if(contPlus == 9){
            
            System.out.println("Es antisimetrica");
        }else{
            System.out.println("No es antisimetrica");
        }
        // supongo que esta bien no ? 
        
    }
    
}
