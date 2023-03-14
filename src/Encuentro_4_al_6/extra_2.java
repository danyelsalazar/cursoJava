/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle 
un valor diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, 
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales 
y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package Encuentro_4_al_6;

public class extra_2 {

    public static void main(String[] args) {
        int a = 1, b = 2 , c = 3 , d = 4, aux ;
        System.out.println(a + " " + b + " " + c + " " + d);
        
        aux = a;
        a = d ;
        d = b;
        b = c ;
        c = aux;
         
        
        System.out.println(a + " " + b + " " + c + " " + d);
    }
    
}
