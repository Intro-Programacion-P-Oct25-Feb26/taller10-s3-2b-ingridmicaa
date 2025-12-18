/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};

        int zonasF = 0;

        for (int f = 0; f < sensores.length; f++) {
            boolean sinFallos = true;

            for (int col = 0; col < sensores[f].length; col++) {

                if (!sensores[f][col]) {

                    sinFallos = false;

                }

            }
            if (sinFallos) {
                zonasF++;
                System.out.println("Zona " + (f + 1) + ": Funciona sin fallos");
            } else {
                System.out.println("Zona " + (f + 1) + ": Presenta al menos un fallo");
            }

        }
        System.out.println("\nTotal de zonas sin fallos: " + zonasF);
    }
}
