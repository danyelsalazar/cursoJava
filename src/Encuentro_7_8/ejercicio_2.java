/*
 Diseñe una función que pida el nombre y la edad de N personas
e imprima los datos de las personas ingresadas por teclado e indique
si son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

 */
package Encuentro_7_8;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
       
        personas();
        
    }
    
    public static void personas(){
        
        int edad , cont = 1;
        String frenar;
        
        do{
            
            System.out.println("¿Cual es la edad de la persona " + cont);
            Scanner leerEdad = new Scanner(System.in);
            edad = leerEdad.nextInt();
            
            if(edad < 18){
                System.out.println("Edad: " + edad);
                System.out.println("Es menor de edad");
            }
            else{
                System.out.println("Edad: " + edad);
                System.out.println("Es mayor de edad");
            }
            
            System.out.println("¿Quiere seguir ingresando personas? escriba ( NO ) si desea parar.");
            Scanner salir = new Scanner(System.in);
            frenar = salir.next();
            
            if(frenar.equalsIgnoreCase("NO")){
                break;
            }
            
            cont++;
            
        }while(!"no".equalsIgnoreCase(frenar));
    }
    
}
