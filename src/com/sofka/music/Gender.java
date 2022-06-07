package com.sofka.music;

public class Gender {
    private int idGender;
    private String name;

    /**
     * Constructor de la clase Gender
     *
     * @param id   recibe como parámetro el identificador del género.
     * @param name recibe como parámetro nombre del género.
     */
    public Gender(int id, String name) {
        this.idGender = id;
        this.name = name;
    }

    /**
     * Método para obtener el identificador del género de la canción.
     *
     * @return retorna un dato entero que representa el identificador del género de la canción.
     */
    public int getIdGender() {
        return idGender;
    }

    /**
     * Método para modificar/asignar el género de la canción.
     *
     * @param idGender recibe como parámetro el identificador a asignar al género de la canción.
     */
    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    /**
     * Método para obtener el nombre del género de la canción.
     *
     * @return retorna un dato entero que representa el género de la canción.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar/asignar la carátula de la canción.
     *
     * @param name recibe como parámetro el nombre a asignar al género de la canción.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para mostrar la información del género de la canción, es decir el valor de los atributos de una canción.
     *
     * @return devuelve los atributos del género de la canción.
     */
    @Override
    public String toString() {
        return name;
    }
}
