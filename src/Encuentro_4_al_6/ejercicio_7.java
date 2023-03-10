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
        System.out.println("Escribe palabras solo con 5 letras");
        
        String palabra, correctas = "", incorrectas = "";
        
        for (int i = 0; i < 4; i++) {
            
            Scanner leerPalabras = new Scanner(System.in);
            palabra = leerPalabras.next();
            
            if(palabra.length() == 5 && palabra.substring(0, 1).equalsIgnoreCase("x") && palabra.substring(4, 5).equalsIgnoreCase("o")){
                
                //correctas = " " + palabra + " &&&&&";
                correctas = palabra + " &&&&&";
            }else{
                    
                    incorrectas = palabra;   
                
                }
            
        }
        
        System.out.println("LISTADO DE PALABRAS:");
        
        System.out.println("CORECTAS:");
        System.out.println(correctas);
        
        System.out.println("INCORRECTAS");
        System.out.println(incorrectas);
        
        
    }
    
}
