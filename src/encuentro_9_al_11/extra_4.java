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
        
        double[] alumnos = new double[5];
        
        int[] nots = new int[4];
        
        int nota, contAlum = 0, i = 0, j= 1;
        double contNota = 0;
        
        Scanner leerNota = new Scanner(System.in);
        
        do{
            
            for (int k = 0; k < nots.length; k++) {
                System.out.println("Cual es la nota del trabajo " + (k+1) + " del alumno " +  j);
                 nota = leerNota.nextInt();
                 nots[k] = nota;
                 contNota = contNota + nots[k];
 
            }
            
            alumnos[i] = (contNota/ 4);
            i++;
            
            j++;
            
            contNota = 0;
            contAlum++;
                
        }while(contAlum < 5);
        
        
        System.out.println("--------------------------- PROMEDIOS -------------------------");
        for (int k = 0; k < alumnos.length; k++) {
            System.out.println("Promedio Alumno " + (k+1) + " " + alumnos[k]);
        }
        
        int aprobados = 0, desaprobados = 0;
        
        for (int k = 0; k < alumnos.length; k++) {
            if(alumnos[k] >= 7){
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        
        System.out.println("------------------------- APROBADOS - DESAPROBADOS -----------------------");
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos desaprobados " + desaprobados);
        
    }
    
}
