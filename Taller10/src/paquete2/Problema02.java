/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int menores = 0;
        int[] adultosF = new int[edades.length];

        for (int f = 0; f < edades.length; f++) {
            int adultos = 0;

            for (int c = 0; c < edades[f].length; c++) {
                if (edades[f][c] < 18) {
                    menores++;
                } else {
                    adultos++;
                }
            }

            adultosF[f] = adultos;
        }

        System.out.printf("Total de menores de edad: %d\n", menores);

        for (int i = 0; i < adultosF.length; i++) {
            System.out.println("Familia " + (i + 1) + ": " + adultosF[i] + 
                    " adultos");
        }
    }
}
