package com.sofka;

/**
 * Interfaz IPlayer contiene los métodos para ser implementados en las clases implementen esta interfaz.
 *
 * @version 2022-06-06
 * @since En esta versión no se modificó el código, solo la documentación respecto la versión entregada en la cantera2 anterior(soy repitente).
 */
public interface IPlayer {

    /**
     * Método para filtrar por género.
     * Este método permite que el usuario busque canciones por género.
     *
     * @author Maira Bastidas Gómez.
     */
    void filterByGender();

    /**
     * Método para filtrar por año.
     * Este método permite que el usuario busque canciones por año.
     *
     * @author Maira Bastidas Gómez.
     */
    void filterByYear();

    /**
     * Método para ordenar por fecha.
     * Este método permite que el usuario ordene las canciones por fecha.
     *
     * @author Maira Bastidas Gómez.
     */
    void orderByDate();

    /**
     * método para listar las canciones de la biblioteca.
     *
     * @author Maira Bastidas Gómez.
     */
    void toListSongs();

    /**
     * Método para mostrar las listas creadas.
     *
     * @author Maira Bastidas Gómez.
     */
    void toListPlayList();

    /**
     * Método para mostrar las canciones de una lista determinada.
     *
     * @author Maira Bastidas Gómez.
     */
    void toListSongsOfList();

}
