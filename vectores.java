package com.steph;

import java.util.Vector;

/**
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 */

public class Main_4 {

    public static void main(String[] args) {
        // Vector de String
        Vector<String> vector = new Vector<String>();
        vector.add("Stephanie");
        vector.add("Ivana");
        vector.add("Josue");
        vector.add("Gianni");
        vector.add("Teresa");

        System.out.println("Datos del vector: " + vector);

        vector.remove(1);
        vector.trimToSize();
        vector.remove(1);

        System.out.println("Resultado final: " + vector);

    }
}
