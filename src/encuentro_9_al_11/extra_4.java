/*
 Los profesores del curso de programación de Egg necesitan llevar
un registro de las notas adquiridas por sus 10 alumnos para luego
obtener una cantidad de aprobados y desaprobados. Durante el período 
de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio
y se guarda en el arreglo. Al final del programa los 
profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo 
aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package encuentro_9_al_11;

import java.util.Scanner;

public class extra_4 {
    
    public static void main(String[] args) {
        
        int[] alumnos = new int[10];
        
        int[] nots = new int[4];
        
        int nota, contNota = 0, contAlum = 0, i = 0, j= 1;
        
        Scanner leerNota = new Scanner(System.in);
        
        do{
            
            for (int k = 0; k < nots.length; k++) {
                System.out.println("Cual es la nota del trabajo " + (k+1) + " del alumno " +  j);
                 nota = leerNota.nextInt();
                 nots[k] = nota;
            }
            
            
            
  
            
            
        }while(contAlum < 10);
    }
    
}
