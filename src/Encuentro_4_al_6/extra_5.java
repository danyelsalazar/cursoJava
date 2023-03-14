/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, 
pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra_5 {

    public static void main(String[] args) {
        String A = "A", B = "B", C = "C", socio;
        double valorOpera;
        System.out.println("¿Que clase de socio eres?");
        Scanner leer = new Scanner(System.in);
        socio = leer.next();
        
        System.out.println("Ingrese el valor del tratamiento");
        Scanner leerValor = new Scanner(System.in);
        valorOpera = leerValor.nextInt();
        
        switch(socio){
            case "A":
                System.out.println("Su clase le da un descuento del 50%");
                System.out.println("El costo final del tratamiento tiene un valor de " + valorOpera / 2);
            break;
             case "B":
                System.out.println("Su clase le da un descuento del 35%");
                System.out.println("El costo final del tratamiento tiene un valor de " + (valorOpera / 100) * 35);
            break;
             case "C":
                System.out.println("Su clase no le da descuento para el tratamiento");
                System.out.println("El costo final del tratamiento tiene un valor de " + valorOpera );
            break;
             default:
                 System.out.println("Clase de socio invalida");
        }
        
        
    }
    
}
