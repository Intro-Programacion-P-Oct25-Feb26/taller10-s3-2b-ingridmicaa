/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double[][] matriz_X = new double[3][3];
        double[][] matriz_A = new double[3][3];
        double[][] matriz_B = new double[3][3];
        
        boolean bandera = true;

       
        for (int fila = 0; fila < matriz_X.length; fila++) {
            
            for (int columna = 0; columna < matriz_X[fila].length; columna++) {
                
                System.out.printf("Ingrese valor para [%d][%d]: ", fila, columna);
                matriz_X[fila][columna] = entrada.nextDouble(); 
            }
        }

        for (int fila = 0; fila < matriz_X.length; fila++) {
            
            for (int columna = 0; columna < matriz_X[fila].length; columna++) {
                
                double x = matriz_X[fila][columna];
                matriz_A[fila][columna] = Math.pow(x + 1, 2); 
            }
        }

        for (int fila = 0; fila < matriz_X.length; fila++) {
            
            for (int columna = 0; columna < matriz_X[fila].length; columna++) {
                
                double x = matriz_X[fila][columna];
                matriz_B[fila][columna] = (x * x) + (2 * x) + 1;
            }
        }

        for (int fila = 0; fila < matriz_X.length; fila++) {
            
            for (int columna = 0; columna < matriz_X[fila].length; columna++) {
                
                if (matriz_A[fila][columna] != matriz_B[fila][columna]) {
                    
                    bandera = false;
                  
                }
            }
        }

        if (bandera) {
            System.out.println("La identidad algebraica se cumple en todos los elementos.");
        } else {
            System.out.println("La identidad algebraica no se cumple en algunos elementos.");
        }
    }
}
