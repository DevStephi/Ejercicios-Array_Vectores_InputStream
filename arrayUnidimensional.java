package com.steph;

/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */

public class Main_2 {

    public static void main(String[] args) {

        String cosas[] = {
                "Televisor",
                "Mesa",
                "Mueble",
                "Cama",
                "Silla"
        };

        for ( String cosa : cosas ){
            System.out.println("Lista de cosas: " + cosa);
        }

    }
}
