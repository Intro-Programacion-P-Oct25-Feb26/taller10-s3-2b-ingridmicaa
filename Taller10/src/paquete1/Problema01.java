/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}};

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] totalAsistencias = new int[estudiantes.length];

        for (int i = 0; i < asistencia.length; i++) {
            int indice = 0;

            for (int col = 0; col < asistencia[i].length; col++) {

                if (asistencia[i][col]) {
                    indice++;
                }

            }
            
            totalAsistencias[i]= indice;
            
        }
        
        for (int i = 0; i < estudiantes.length; i++) { 
            System.out.printf("Estudiante:%s\n Asistencias: %d\n ", 
                    estudiantes[i],
                    totalAsistencias[i]);
            if (totalAsistencias[i] == 5) { 
                
                System.out.println("Asistencia completa");
                
            }else { 
                
                System.out.println("No tiene asistencia completa");
            }
        } 
    }

}
