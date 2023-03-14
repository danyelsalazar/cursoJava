/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

* * * *
*     *
*     *
* * * *

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercico_8 {

    public static void main(String[] args) {
        int lados;
        Scanner leerLados = new Scanner(System.in);
        
        lados = leerLados.nextInt();
        
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if(i == 0 || i == lados - 1 || j == 0 || j == lados - 1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
