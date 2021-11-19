package com.steph;

/**
 * Ejercicio texto invertido
 */

public class Main_1 {

    public static void main(String[] args) {
        String holaMundo = "Hola Mundo";
//        String textoReverse = reverse(holaMundo);

        System.out.println(holaMundo);
//        System.out.println(textoReverse);
        System.out.println("Texto invertido: " + reverse(holaMundo));
    }

//    public static String reverse(String holaMundo) {
//        if (holaMundo.length() == 1)
//            return holaMundo;
//        else
//            return reverse(holaMundo.substring(1)) + holaMundo.charAt(0);
//
//    }

    public static String reverse(String holaMundo){
        String textoReverse = "";
        for (int i = holaMundo.length() -1; i >= 0; i--){
            textoReverse = textoReverse + holaMundo.charAt(i);

        }
        return textoReverse;
    }

}
