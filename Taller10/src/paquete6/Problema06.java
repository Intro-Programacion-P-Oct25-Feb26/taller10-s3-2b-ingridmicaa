/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package paquete6;
 import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[][] matriz = new double[5][6];
        double[][] matrizResultante = new double[5][6];

        System.out.print("Ingrese un número entero o real: ");
        double num = entrada.nextDouble();

        
        System.out.println("Ingrese los valores de la matriz (5x6):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextDouble();
            }
        }

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrizResultante[i][j] = matriz[i][j] * num;
            }
        }

      
        System.out.println("\nMatriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }

       
        System.out.println("\nMatriz Resultante (multiplicada por " + num + "):\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%.2f\t", matrizResultante[i][j]);
            }
          
        }

        
    }
}


    


