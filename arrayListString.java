package com.steph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * rea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class Main_5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Casa");
        lista.add("Carro");
        lista.add("Piscina");
        lista.add("Jardín");

        System.out.println("Imprimir ArrayList: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        LinkedList<String> listaLinked = new LinkedList<String>(lista);

        System.out.println("Imprimir lista Linked: ");
        for (int i = 0; i < listaLinked.size(); i++) {
            System.out.println(listaLinked.get(i));
        }
    }
}
