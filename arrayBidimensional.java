package com.steph;

/**
 * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class Main_3 {

    public static void main(String[] args) {
        int arrayBidi[][] = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en i: " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }

        }
    }
}
