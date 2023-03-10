/*
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        
        int limite = 20 , numUser = 0, suma = 0;
        
        do{
            
            System.out.println("Escribe un numero");
            Scanner leerNum = new Scanner(System.in);
            numUser = leerNum.nextInt();
            suma = suma + numUser;
            
        }while(suma <= 20);
        
        System.out.println("has superado el limite");
    }
    
}
