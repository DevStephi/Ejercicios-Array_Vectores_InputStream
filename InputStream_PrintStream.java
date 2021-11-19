package com.steph;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
 * en "fileOut".
 */

public class Main_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ruta del fichero que se quiere copiar:
        String rutaInicio = fileIn();

        // Nombre del fichero:
        System.out.println("Escribe el nombre del fichero: ");
        String ficheroIn = scanner.next();

        // Ruta del fichero de destino:
        String rutaDestino = fileOut();

        //Pedimos nombre de archivo nuevo
        System.out.println("Escribe el nombre del fichero: ");
        String ficheroOut = scanner.next();

        //Leemos los datos
        byte [] contenido = leerFichero(rutaInicio,ficheroIn);

        //Copiamos en un fichero nuevo
        copiarFichero(contenido,rutaDestino,ficheroOut);

    }

    // Método del fichero de entrada (el que se quiere copiar)
    public static String fileIn(){
        System.out.println("Introduce la ruta del fichero que quieres copiar: ");

        Scanner scanner = new Scanner(System.in);
        String rutaInicio = scanner.next();

        return rutaInicio;
    }

    // Método del fichero destino (donde estará la copia)
    public static String fileOut(){
        System.out.println("Introduce la ruta de destino : ");

        Scanner scanner = new Scanner(System.in);
        String rutaDestino = scanner.next();

        return rutaDestino;
    }

    // Método para leer los datos del fichero
    public static byte[] leerFichero(String rutaInicio, String ficheroIn) {
        byte[] contenido = null   ;
        try{
            InputStream in = new FileInputStream(rutaInicio + "\\"+ficheroIn);
            contenido = in.readAllBytes();
        }catch (Exception e){
            System.out.println("No se encuentra el fichero!!: " + e.getMessage());
        }
        return contenido;
    }

    // Método para copiar el fichero
    public static void copiarFichero(byte[] contenido, String rutaDestino, String ficheroOut){

        try{
            PrintStream out = new PrintStream(rutaDestino + "\\"+ficheroOut);
            out.write(contenido);
        }catch (Exception e){
            System.out.println("Error!!!!:" + e.getMessage());
        }
    }

}
