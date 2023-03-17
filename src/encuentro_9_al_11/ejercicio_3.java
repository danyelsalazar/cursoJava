/*
 Recorrer un vector de N enteros contabilizando cuántos 
números son de 1 dígito, cuántos de 2 dígitos, etcétera
(hasta 5 dígitos). ah falta hacer el contador 
 */
package encuentro_9_al_11;

import java.util.Scanner;


public class ejercicio_3 {

    
    public static void main(String[] args) {
        int tamano, longitud;
        System.out.println("De que longitud quieres el vector");
        Scanner leer = new Scanner(System.in);
        tamano = leer.nextInt();
        
        int[] vector = new int[tamano];
        
        int uno =0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        
        //digitos = (int)(Math.log10(numero)+1); esta es una cosa para obtener la longitud de un numero 
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int)(Math.random()*100000);
            
            longitud = (int)(Math.log10(vector[i])+1);
            
            switch (longitud) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5: 
                    cinco++;
            }
        }
        System.out.println("Hay " + uno + " numeros de un digito");
        System.out.println("Hay " + dos + " numeros de dos digito");
        System.out.println("Hay " + tres + " numeros de tres digito");
        System.out.println("Hay " + cuatro + " numeros de cuatro digito");
        System.out.println("Hay " + cinco + " numeros de cinco digito");
    }
    
}
