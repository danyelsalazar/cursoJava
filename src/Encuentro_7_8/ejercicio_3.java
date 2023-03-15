/*
 Crea una aplicación que a través de una función nos convierta
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:

 0.86 libras es un 1 €
 1.28611 $ es un 1 €
 129.852 yenes es un 1 €

 */
package Encuentro_7_8;

import java.util.Scanner;


public class ejercicio_3 {

    public static void main(String[] args) {
        
        double euros;
        int moneda;
        
        System.out.println("--------------- CASA DE CAMBIO ----------------");
        System.out.println("¿A que moneda quieres hacer el cambio?");
        System.out.println("1 - Libras");
        System.out.println("2 - Dolares");
        System.out.println("3 - Yenes");
        Scanner leerMony = new Scanner(System.in);
        moneda = leerMony.nextInt();
        
        System.out.println("¿Cuantos euros vas a cambiar?");
        Scanner leerEur = new Scanner(System.in);
        euros = leerEur.nextDouble();
        
        convertir(euros,moneda);
        
    }
    
    public static void convertir( double eur, int money){
        
        double libras = 0.86 , dolar = 1.28611 , yenes = 129.852;
        
        switch (money){
            case 1:
                System.out.println("El cambio de divisas es: " + (libras * eur) + " Libras");
            break;
            case 2:
                System.out.println("El cambio de divisas es: " + (dolar * eur) + " Dolares");
            break;
            case 3:
                System.out.println("El cambio de divisas es: " + (yenes * eur) + " Yenes");
        }
        
    }
    
}
