/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la
siguiente manera: cada vocal se reemplaza por el carácter que se indica en la 
tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Encuentro_7_8;

import java.util.Scanner;


public class guiaTeorica_eje_1 {

    public static void main(String[] args) {
        
        String frase=" ";
        
        while(!".".equals(frase.substring(frase.length()-1))){
            
            System.out.println("escriba una frase terminada en punto");
            Scanner leer = new Scanner(System.in);
            frase=leer.nextLine();
        
        }
        System.out.println(codes(frase));
    }
    
    public static String codes(String frase){
        
            String code="";
         
            for (int i = 0; i < frase.length(); i++) {
                
                String letra=frase.substring(i,i+1);
                letra=letra.toLowerCase();
                
                if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                    switch(letra){
                        case "a":
                            code=code.concat("@");
                        break;
                        case "e":
                            code=code.concat("#");
                        break;
                        case "i":
                            code=code.concat("$");
                        break;
                        case "o":
                            code=code.concat("%");
                         break;
                         case "u":
                            code=code.concat("*");
                        break;
                    }
                }else{
                code=code.concat(letra);
            }
        }
        System.out.println(code);
        return code;
    }
    
}
