/*
 Utilizando un Bucle for, aloja en el vector Equipo,
los nombres de tus compañeros de equipo

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class guiaTeorica_eje_2 {

    public static void main(String[] args) {
        
        int cant;
        System.out.println("Escribe la cantidad de compañeros");
        Scanner leer = new Scanner(System.in);
        cant = leer.nextInt();
        
        String[] nombres = new String[cant];
        
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Escribe el nombre del compañero " + (i+1));
            Scanner leerName = new Scanner(System.in);
            nombres[i] = leerName.next();
        }
        
        System.out.println("Los nombres de los compañeros son: ");
        
        for (int i = 0; i < cant; i++) {
            System.out.println(nombres[i]);
            
        }
    }
    
}
