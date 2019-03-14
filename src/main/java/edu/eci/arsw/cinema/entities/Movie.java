package edu.eci.arsw.cinema.entities;

import org.springframework.stereotype.Service;

/**
 * @author Andres Florez
 */

public class Movie {
    private String name;
    private String genre;

    public Movie() {
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}