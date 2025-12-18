/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[][] A = new int[3][2];
        int[][] B = new int[3][2];

        String respuesta = "";

        System.out.println("Ingrese los valores de la matriz A (3x2):");
        for (int f = 0; f < 3; f++) {
            for (int cl = 0; cl < 2; cl++) {
                System.out.printf("A[%d][%d]: ", f, cl);
                A[f][cl] = entrada.nextInt();
            }
        }

        System.out.println("\nIngrese los valores de la matriz B (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = entrada.nextInt();
            }
        }

        respuesta = String.format("%s\nMatriz A:\n", respuesta);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                respuesta = String.format("%s%d ", respuesta, A[i][j]);
            }
            respuesta = String.format("%s\n", respuesta);
        }

        respuesta = String.format("%s\nMatriz B:\n", respuesta);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                respuesta = String.format("%s%d ", respuesta, B[i][j]);
            }
            respuesta = String.format("%s\n", respuesta);
        }

        int contadorMenor = 0;
        int contadorMayor = 0;
        int contadorI = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (A[i][j] < B[i][j]) {
                    contadorMenor++;
                }
                if (A[i][j] > B[i][j]) {
                    contadorMayor++;
                }
                if (A[i][j] == B[i][j]) {
                    contadorI++;
                }
            }
        }

        if (contadorI == 6) {
            respuesta = String.format("%s\nLa matriz A es igual a la matriz B",
                    respuesta);

        } else if (contadorMenor == 0 && contadorMayor > 0) {
            respuesta = String.format("%s\nLa matriz A es mayor que la matriz B", 
                    respuesta);

        } else {
            respuesta = String.format("%s\nLa matriz A no es mayor que la matriz B", 
                    respuesta);
        }

        System.out.println(respuesta);
    }
}
        
    
