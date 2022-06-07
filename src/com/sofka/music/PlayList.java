package com.sofka.music;

import java.util.ArrayList;

/**
 * Clase PlayList, representa una lista de canciones que tiene 2 atributos, el nombre y una lista de canciones.
 * @version 2022-06-06
 * @since en esta Clase no se modificó el código, solo la documentación respecto
 * a la versión entregada en la Cantera 2 pasada(soy repitente), ya que no hice la debida documentación.
 * @author Maira Bastidas Gómez
 */
public class PlayList {
    private String name;
    private ArrayList<Song> songs;

    /**
     * Constructor de la clase PlayList
     *
     * @param name  recibe como parámetro el nombre de la lista de canciones a crear.
     * @param songs recibe como parámetro la lista de canciones a asignar a la lista.
     */
    public PlayList(String name, ArrayList<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    /**
     * Método para obtener el nombre de la lista de canciones
     *
     * @return devuelve el nombre de la lista de canciones.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar/asignar el nombre de la lista de canciones.
     *
     * @param name recibe como parámetro el nombre a asignar a la lista de canciones.
     */
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Método para modificar/asignar la lista de canciones.
     *
     * @param songs recibe como parámetro una lista de canciones a asignar a la lista de canciones.
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }


}
