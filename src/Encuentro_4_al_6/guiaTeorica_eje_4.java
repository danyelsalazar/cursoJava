/*
 Escriba un programa que lea 20 números.
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class guiaTeorica_eje_4 {

    
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int cont = 0;
        
        System.out.println("El programa sumara los numeros que pases por consola, si escribes el 0 saldra del bucle");
        
        do{
            
            System.out.println("Escribe un numero");
            Scanner leerNum = new Scanner(System.in);
            num = leerNum.nextInt();
            
            if(num == 0){
                
                break;
                
            }
            else if(num > 0){
                
                suma = suma + num;
                
            }else{
                
                System.out.println("El numero no se sumo porque es negativo");
                
            }
            System.out.println("La sumatoria hasta el momento es: " + suma);
            
            cont++;
            
            if (cont == 20){
                break;
            }
            
        } while(num > 0 || num < 0 && cont <= 20);
        
        if(num == 0){
            System.out.println("Se capturo el numero 0");
        }else{
            System.out.println("La sumatoria final es: " + suma);
        }
          
    }
    
}
