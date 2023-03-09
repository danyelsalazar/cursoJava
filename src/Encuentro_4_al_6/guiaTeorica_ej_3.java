/*
 Escriba un programa que valide si una nota está  entre 0 y 10,
sino está  entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class guiaTeorica_ej_3 {

    public static void main(String[] args) {
        int nota;
        
        System.out.println("¿Cual es la nota?");
        Scanner obtenerNota = new Scanner(System.in);
        
        nota = obtenerNota.nextInt();
        
        while(nota > 10 || nota < 0){
            System.out.println("La nota no es correcta");
            System.out.println("¿Cual es la nota?");
            Scanner obtenerNota2 = new Scanner(System.in);
            nota = obtenerNota2.nextInt();   
        }
        
        if(nota <= 5 ){
            
            System.out.println("Estas reprobado");
        }
        else if(nota > 5 && nota <= 10){
            System.out.println("Estas aprobado");
        }
    }
    
}
