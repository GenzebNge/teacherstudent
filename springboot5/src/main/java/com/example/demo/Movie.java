package com.example.demo;

import javax.persistence.*;
import javax.xml.ws.Action;

import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private long year;
    private String description;

    @ManyToMany
    private Set<Movie> cast;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Movie> getCast() {
        return cast;
    }

    public void setCast(Set<Movie> cast) {
        this.cast = cast;
    }
}
