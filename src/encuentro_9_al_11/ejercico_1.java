/*
Realizar un algoritmo que llene un vector con los 100 
primeros números enteros y los muestre por pantalla en
orden descendente.

 */
package encuentro_9_al_11;

public class ejercico_1 {

    public static void main(String[] args) {
        int [] vector = new int[100];
        System.out.println("El vector se llenara con 100 numeros");
        
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = i;
        }
        
        for (int i = vector.length -1; i > 0; i--) {
            System.out.println(vector[i]);
        }
    }
    
}
