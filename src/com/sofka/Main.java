package com.sofka;

import com.sofka.music.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase Main inicia la ejecución del programa.
 *
 * @author Maira Bastidas Gómez
 * @version 2022-06-06
 * @since En esta versión se modificó a línea 37 para corregir el menú, además se mejoró la documentación
 * respecto la versión entregada en la cantera2 anterior(soy repitente).
 */
public class Main {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.Library();
        Scanner sn = new Scanner(System.in);
        Menu menu = new Menu();
        boolean salir = false;
        int opcion;
        /*
        * El siguiente ciclo se repite hasta que el usuario digite 9 para salir.
         */
        while (!salir) {
            menu.menuMain();
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> musicLibrary.toListSongs();
                    case 2 -> musicLibrary.createPlayList();
                    case 3 -> musicLibrary.filterByGender();
                    case 4 -> musicLibrary.filterByYear();
                    case 5 -> musicLibrary.orderByDate();
                    case 6 -> musicLibrary.orderByDuration();
                    case 7 -> musicLibrary.toListPlayList();
                    case 8 -> musicLibrary.toListSongsOfList();
                    case 9 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
