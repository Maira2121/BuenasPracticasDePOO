package com.sofka.music;

import javax.swing.ImageIcon;
import java.time.Duration;
import java.time.LocalDate;

/**
 * Clase Song: clase canción con los atributos solicitados por el taller.
 *
 * @version 2022-06-06
 * @since en esta Clase no se modificó el código, solo la documentación respecto
 * a la versión entregada en la Cantera 2 pasada(soy repitente).
 * @author Maira Bastidas Gómez
 */
public class Song {
    private int id;
    private String title;
    private LocalDate date;
    private Duration duration;
    private Gender gender;
    private ImageIcon cover;
    private String description;

    /**
     * Constructor de la clase.
     *
     * @param id          atributo que representa la identificación de la clase
     * @param title       atributo que representa el título de la canción.
     * @param date        atributo que representa la fecha de la canción.
     * @param duration    atributo que representa la duración de la canción.
     * @param gender      atributo que representa el género de la canción.
     * @param cover       atributo que representa la carátula de la canción
     * @param description atributo que representa la descripción de la canción.
     *
     */
    public Song(int id, String title, LocalDate date, Duration duration, Gender gender, ImageIcon cover, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Método para obtener el identificador de la canción
     *
     * @return retorna un dato entero que representa el identificador de la canción.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para modificar/asignar el identificador de la canción
     *
     * @param id recibe como parámetro el identificador a asignar a la canción
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para obtener el título de la canción.
     *
     * @return devuelve un dato de tipo string que representa el título dela canción
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método para modificar/asignar el título de la canción
     *
     * @param title recibe como parámetro el título a asignar a la canción
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método para obtener la fecha de la canción
     *
     * @return devuelve un dato de tipo Date que representa la fecha de la canción.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Método para modificar/asignar la fecha de la canción
     *
     * @param date recibe como parámetro la fecha a asignar a la canción
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Método para obtener la duración de la canción
     *
     * @return devuelve un tipo de dato Duration que representa la duración de la canción.
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Método para modificar/asignar la duración de la canción
     *
     * @param duration recibe como parámetro la duración a asignar a la canción
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * Método para obtener el género de la canción.
     *
     * @return devuelve un dato de tipo Gender que representa el género de la canción.
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Método para modificar/asignar el género de la canción
     *
     * @param gender recibe como parámetro el género a asignar a la canción
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Método para obtener la carátula de la canción.
     *
     * @return devuelve un dato de tipo ImageIco que representa la carátula de la canción.
     */
    public ImageIcon getCover() {
        return cover;
    }

    /**
     * Método para modificar/asignar la carátula de la canción
     *
     * @param cover recibe como parámetro la carátula a asignar a la canción
     */
    public void setCover(ImageIcon cover) {
        this.cover = cover;
    }

    /**
     * Método para obtener la descripción de la canción
     *
     * @return devuelve un dato de tipo String que representa la descripción de la canción
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método para modificar/asignar la descripción de la canción
     *
     * @param description recibe como parámetro la descripción a asignar a la canción
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método para mostrar la información de la canción, es decir el valor de los atributos de una canción.
     *
     * @return devuelve los atributos de la canción.
     */
    @Override
    public String toString() {
        return "Canción [" +
                "Título: " + title +
                ", Fecha: " + date +
                ", duration: " + duration.toMinutesPart() +
                ", Género: " + gender +
                ", Descripción: " + description + "]";
    }

}
