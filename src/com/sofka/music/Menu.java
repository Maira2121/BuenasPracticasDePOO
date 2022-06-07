package com.sofka.music;

public class Menu {

    /**
     * Clase menú fue creada para llamar los métodos y no hacer más largas la clase donde se utilizan,
     * así que solo se debe crear una instancia de la clase y llamar el método requerido.
     *
     * @author Maira Bastidas Gómez
     * ---------------------------------
     * @since En esta Clase no se modificó el código, solo la documentación respecto
     * * a la versión entregada en la Cantera 2 pasada(soy repitente), ya que no hice la debida documentación.
     */
    public void menuMain() {
        System.out.println("---------------------------------");
        System.out.println("Menú principal");
        System.out.println("---------------------------------");
        System.out.println("1. Listar cancines");
        System.out.println("2. Crear lista de reproducción");
        System.out.println("3. Filtrar por género");
        System.out.println("4. Filtrar canciones en el mismo año");
        System.out.println("5. Ordenar por fecha");
        System.out.println("6. Ordenar por duración");
        System.out.println("7. Listar listas de canciones");
        System.out.println("8. Listar canciones de una lista");
        System.out.println("9. Salir");
        System.out.println("---------------------------------");
    }

    /**
     * Método utilizado en la clase MusicLibrary.
     */
    public void menuOrderDate() {
        System.out.println("---------------------------------");
        System.out.println("Menú ordenar por fecha");
        System.out.println("---------------------------------");
        System.out.println("1. Ordenar canciones por más antiguas");
        System.out.println("2. Ordenar canciones por más reciente ");
    }

    public void menuOrderDuration() {
        System.out.println("---------------------------------");
        System.out.println("Menú ordenar por duración");
        System.out.println("---------------------------------");
        System.out.println("1. Ordenar canciones de menor a mayor duración");
        System.out.println("2. Ordenar canciones mayor a menor duración ");
    }
}
