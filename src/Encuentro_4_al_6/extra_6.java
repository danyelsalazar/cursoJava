/*
Leer la altura de N personas y determinar el promedio de estaturas
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package Encuentro_4_al_6;

import java.util.Scanner;


public class extra_6 {

    public static void main(String[] args) {
        int cont = 1;
        float  estaturas = 0;
        System.out.println("--------------------- Calcular promedio de estaturas -----------------------------");
        System.out.println("Ingrese la cantidad de personas");
        Scanner sn = new Scanner(System.in);
        float personas = sn.nextFloat();
        
        while(cont <= personas){
              System.out.println("Ingrese la estatura de la persona " + cont);
              float n = sn.nextFloat();
              estaturas += n;
              cont++;
        }
        
        float promedioGeneral = estaturas / personas;
        System.out.println(promedioGeneral);
    }
    
}
