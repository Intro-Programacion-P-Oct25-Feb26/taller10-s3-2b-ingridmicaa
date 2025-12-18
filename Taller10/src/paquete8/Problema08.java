/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package paquete8;

import java.util.Scanner;

public class Problema08 {
    
    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};

        double[][] respuesta = new double[2][3];
        String salida = "";

        for (int i = 0; i < respuesta.length; i++) {
            for (int j = 0; j < respuesta[i].length; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    respuesta[i][j] = dato1[i][j];
                } else {
                    respuesta[i][j] = dato2[i][j];
                }
                salida = salida + respuesta[i][j] + " ";
            }
            salida = salida + "\n";
        }

        System.out.println(salida);
    }
}
    

