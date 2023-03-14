/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter
tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
las siguientes funciones de Java Substring(), Length(), equals().

 */
package Encuentro_4_al_6;

import java.util.Scanner;

public class ejercicio_7 {

    public static void main(String[] args) {
        
        
        //String sa = "hola";
        //System.out.println(sa.substring(3, 4));
        
        
        System.out.println("---------------- Dispositivo RS232 -----------------");
        
        String palabra, fde = "&&&&&";
        int contV = 0, contF = 0;
        boolean salir = true;
        
        do{
            
            System.out.println("Ingrese una secuencia");
            System.out.println("Para salir escriba la secuencia FDE");
            
            Scanner leerPalabra = new Scanner(System.in);
            palabra = leerPalabra.next();
            
            if(palabra.equals(fde)){
                
                System.out.println("Saliste del programa");
                salir = false;
            }
            else if(palabra.length() <= 5 & palabra.substring(0, 1).equals("X") & palabra.substring(palabra.length() -1, palabra.length()).equals("O")){
                
                System.out.println("SECUENCIA CORRECTA");
                contV++;
                
            }
            else{
                System.out.println("SECUENCIA INCORRECTA");
                contF++;
            }
        
        }while(salir);
        
        System.out.println("La cantidad de palabras correctas son: " + contV);
        System.out.println("La cantidad de palabras incorrectas son: " + contF);
    }
    
}
