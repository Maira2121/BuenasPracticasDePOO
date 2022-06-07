package com.sofka;

import com.sofka.music.Gender;
import com.sofka.music.Menu;
import com.sofka.music.PlayList;
import com.sofka.music.Song;

import javax.swing.ImageIcon;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Clase MusicLibrary. Esta clase maneja las funcionalidades del reproductor de música, tiene como atributos de clase,
 * una lista de todas las canciones, una listas de las listas de canciones y una lista de los géneros de las canciones.
 *
 * @author Maira Bastidas Gómez
 * @version 2022-06-06
 * @since en esta versión no se modificó el código solo se mejoró la documentación respecto a versión entregada en la Cantera 2 pasada(soy repitente).
 */
public class MusicLibrary implements IPlayer {
    public Scanner leerDato = new Scanner(System.in);
    private final ArrayList<Song> songs = new ArrayList<>();
    private final ArrayList<PlayList> lists = new ArrayList<>();
    private final ArrayList<Gender> genders = new ArrayList<>();

    /**
     * Constructor de la clase Library
     *
     * @author Maira Bastidas Gómez
     */
    public void Library() {
        createSong();

    }

    /**
     * método para llenar la base de datos pequeña de las canciones de la biblioteca.
     *
     * @author Maira Bastidas Gómez
     */
    private void createSong() {
        Gender pop = new Gender(1, "Pop");
        Gender salsa = new Gender(2, "Salsa");
        Gender regueton = new Gender(3, "Reguetón");
        Gender vallenato = new Gender(4, "Vallenato");
        Gender popular = new Gender(5, "Popular");
        Gender balada = new Gender(6, "Balada");
        genders.add(pop);
        genders.add(salsa);
        genders.add(regueton);
        genders.add(vallenato);
        genders.add(popular);
        genders.add(balada);
        ImageIcon cover1 = new ImageIcon();
        songs.add(new Song(1, "Señorita", LocalDate.of(2018, 3, 2), Duration.ofMinutes(3),
                pop, cover1, "Trata de la mujer independiente"));
        songs.add(new Song(2, "Idilio", LocalDate.of(1993, 6, 12), Duration.ofSeconds(306, 6),
                salsa, cover1, "Trata del amor"));
        songs.add(new Song(3, "Muere una flor", LocalDate.of(1995, 4, 18), Duration.ofSeconds(206, 4),
                vallenato, cover1, "Trata del desamor"));
        songs.add(new Song(4, "Jordan", LocalDate.of(2021, 1, 22), Duration.ofSeconds(106, 8),
                regueton, cover1, "Trata del reguetón"));
        songs.add(new Song(5, "Barco", LocalDate.of(2021, 5, 11), Duration.ofSeconds(191, 8),
                regueton, cover1, "Trata de la separación"));

    }

    /**
     * Método para crear las lista de canciones
     *
     * @author Maira Bastidas Gómez
     */
    public void createPlayList() {
        String name, nameSong, answer = "s";
        ArrayList<Song> songsList = new ArrayList<>();
        int resp;
        messageView("Escriba el nombre de la lista de cancines a crear");
        name = captureStringData();
        PlayList list = new PlayList(name, songsList);
        lists.add(list);
        messageView("Lista creada...");
        do {
            try {
                if (Objects.equals(answer, "s")) {
                    messageView("Escriba el nombre de la canción agregar a la lista");
                    nameSong = captureStringData();
                    resp = searchSong(nameSong);
                    if (resp != -1) {
                        songsList.add(songs.get(resp));
                        messageView("Canción agregada con éxito.");
                    } else {
                        messageView("Esta canción no existe en la biblioteca");

                    }
                } else {
                    System.out.println("Debes ingresar s ó n");
                }
                messageView("¿Desea agregar otra canción?: s para Sí  n para No.");
                answer = captureStringData();
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar s ó n");
            }

        }
        while (!Objects.equals(answer, "n"));
    }

    /**
     * Método para determinar si la canción existe
     *
     * @param nameSong recibe como parámetro el nombre de la canción a buscar.
     * @return devuelve un dato de tipo entero (la posición de la canción en el arraylist, si esta existe) y -1 si la canción no existe.
     * @author Maira Bastidas Gómez
     */
    private int searchSong(String nameSong) {
        int pos = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(nameSong)) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método para buscar una lista de canciones por el nombre.
     *
     * @param nameList recibe como parámetro el nombre de la lista a buscar
     * @return devuelve un dato de tipo entero (la posición de la lista en el arraylist, si esta existe) y -1 si la lista no existe.
     * @author Maira Bastidas Gómez
     */
    private int searchList(String nameList) {
        int pos = -1;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getName().equalsIgnoreCase(nameList)) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método para buscar una lista por el género.
     *
     * @param gender recibe como parámetro el nombre del género
     * @return devuelve un dato de tipo entero (la posición del género en el arraylist, si esta existe) y -1 si la lista no existe.
     * @author Maira Bastidas Gómez
     */
    private int searchGender(String gender) {
        int pos = -1;
        for (int i = 0; i < genders.size(); i++) {
            if (genders.get(i).getName().equals(gender)) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método para buscar una lista por año.
     *
     * @param year recibe como parámetro el nombre del género
     * @return devuelve un dato de tipo entero (la posición del género en el arraylist, si esta existe) y -1 si la lista no existe.
     * @author Maira Bastidas Gómez
     */
    private int searchYear(int year) {
        int pos = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getDate().getYear() == year) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método para mostrar las canciones por género. Pide el nombre del género para filtrar.
     *
     * @author Maira Bastidas Gómez
     */
    @Override
    public void filterByGender() {
        String gender;
        messageView("Ingrese el género a filtrar");
        gender = captureStringData();
        if (searchGender(gender) != -1) {
            for (Song song : songs) {
                if (song.getGender().getName().equals(gender)) {
                    System.out.println(song.getTitle() + ", " + song.getGender().getName());
                }
            }
        } else {
            messageView("Este género no existe en la biblioteca musical");
        }
    }

    /**
     * Método para filtrar por año. Pide al usuario que ingrese el año a filtrar,
     *
     * @author Maira Bastidas Gómez
     * muestra el título de la canción y el año. Esta clase se define en la interfaz IPlayer y se implementa acá.
     */
    @Override
    public void filterByYear() {
        int year;
        messageView("Ingrese el año a filtrar");
        year = captureNumericalData();
        if (searchYear(year) != -1) {
            for (Song song : songs) {
                if (song.getDate().getYear() == year) {
                    System.out.println(song.getTitle() + ", " + song.getDate().getYear());
                }
            }
        } else {
            messageView("Este género no existe en la biblioteca musical");
        }
    }

    /**
     * Método sobreescrito de la Interfaz IPlayer para mostrar las canciones que existen en la biblioteca.
     *
     * @author Maira Bastidas Gómez
     */
    @Override
    public void toListSongs() {
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }

    /**
     * Método sobreescrito de la Interfaz IPlayer que muestra la lista de canciones creadas.
     *
     * @author Maira Bastidas Gómez
     */
    @Override
    public void toListPlayList() {
        if (lists.size() != 0) {
            for (PlayList list : lists) {
                System.out.println(list.getName());
            }
        } else {
            System.out.println("Aún no se han creado listas de reproducción.");
        }

    }

    /**
     * Método sobreescrito de la Interfaz IPlayer que muestra las canciones de una lista creada.
     *
     * @author Maira Bastidas Gómez
     */
    @Override
    public void toListSongsOfList() {
        String nameList;
        int answer;
        messageView("Ingrese el nombre de la lista que desea ver");
        nameList = captureStringData();
        answer = searchList(nameList);
        if (answer != -1) {
            for (int i = 0; i < lists.get(answer).getSongs().size(); i++) {
                System.out.println(lists.get(answer).getSongs().get(i).getTitle());
            }
        } else {
            messageView("Esta lista no existe!");
        }

    }

    /**
     * Método sobreescrito de la Interfaz IPlayer que muestra las canciones ordenadas por fecha,
     * ya sea por más reciente o por más antigua.
     *
     * @author Maira Bastidas Gómez
     */
    @Override
    public void orderByDate() {
        Menu menu = new Menu();
        int option;
        Scanner sn = new Scanner(System.in);
        menu.menuOrderDate();
        option = sn.nextInt();
        switch (option) {
            case 1 -> {
                songs.sort(Comparator.comparing(Song::getDate));
                messageView("Orden por fecha más antigua");
                for (Song song : songs) {
                    System.out.println(song.getTitle() + ", Fecha: " + song.getDate());
                }
            }
            case 2 -> {
                songs.sort(Comparator.comparing(Song::getDate));
                messageView("Orden por fecha más reciente");
                Collections.reverse(songs);
                for (Song song : songs) {
                    System.out.println(song.getTitle() + ", Fecha: " + song.getDate());
                }
            }
            default -> System.out.println("Solo números entre 1 y 2");
        }
    }

    /**
     * Método para mostrar las canciones ordenadas por duración, ya sea por mayor o menor duración.
     *
     * @author Maira Bastidas Gómez
     */
    public void orderByDuration() {
        Menu menu = new Menu();
        int option;
        Scanner sn = new Scanner(System.in);
        menu.menuOrderDuration();
        option = sn.nextInt();
        switch (option) {
            case 1 -> {
                songs.sort(Comparator.comparing(Song::getDuration));
                messageView("Orden por menor duración");
                for (Song song : songs) {
                    System.out.println(song.getTitle() + ", Duración: " + song.getDuration().toMinutesPart());
                }
            }
            case 2 -> {
                songs.sort(Comparator.comparing(Song::getDuration));
                Collections.reverse(songs);
                messageView("Orden por mayor duración");
                for (Song song : songs) {
                    System.out.println(song.getTitle() + ", Duración: " + song.getDuration().toMinutesPart());
                }
            }
            default -> System.out.println("Solo números entre 1 y 2");
        }
    }

    /**
     * Método para mostrar mensajes.
     *
     * @param message recibe como parámetro un String que representa el mensaje.
     * @author Maira Bastidas Gómez
     */
    private void messageView(String message) {
        System.out.println(message);
    }

    /**
     * Método para capturar un dato de tipo String
     *
     * @return el dato ingresado por consola.
     * @author Maira Bastidas Gómez
     */
    private String captureStringData() {
        return leerDato.nextLine();
    }

    /**
     * Método para capturar un dato de tipo int
     *
     * @return el dato ingresado por consola.
     * @author Maira Bastidas Gómez
     */
    private int captureNumericalData() {
        return leerDato.nextInt();
    }
}
