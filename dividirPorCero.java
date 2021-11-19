package com.steph;

import java.util.Scanner;

/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
 * a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */

public class Main_7 {

    public static void main(String[] args) {

        // Leer variables por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los números a dividir: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();


        try {
            DividePorCero(numA,numB);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }

    public static float DividePorCero(int numA, int numB) {
        float resultado = 0;

        try {
            resultado = numA / numB;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }


}
