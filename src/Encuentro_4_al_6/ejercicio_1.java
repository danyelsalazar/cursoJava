//Crear un programa que dado un número determine si es par o impar.

package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        
        double num;
        System.out.println("Escribe un numero y compruebo si es par o impar");
        Scanner leerNum = new Scanner(System.in);
        num = leerNum.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        
    }
    
}
