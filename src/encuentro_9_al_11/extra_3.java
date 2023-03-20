/*
 Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función
o procedimiento que imprima el vector.

 */
package encuentro_9_al_11;

public class extra_3 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static int llenarVector(int[] copia){
        
        for (int i = 0; i < copia.length; i++) {
            copia[i] = (int)(Math.random()*10);
        }
        return 0;
    }
    public static void mostrarVector(int[] mostrar){
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println(" " + mostrar[i]);
        }
    }
    
}
