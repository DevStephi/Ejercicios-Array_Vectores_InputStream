package com.steph;

import java.util.ArrayList;

/**
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los números pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
 */

public class Main_6 {

    public static void main(String[] args) {
        ArrayList<Integer> secuencia = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++){
//            secuencia.add(i);
            if (i%2!=0)
                secuencia.add(i);
        }
        System.out.println("ArrayList: " + secuencia);

        for (int j = 0; j < secuencia.size(); j++){
            System.out.println(secuencia.get(j));
        }

    }
}
