package com.ejemplo.biblioteca.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Anotación @Entity se requiere para que JPA reconozca la clase como una entidad persistente.
@Entity
public class Book {

    // La anotación @Id indica que el campo 'id' es la clave primaria en la base de datos.
    @Id
    private String id;
    private String title;
    private String author;
    private String isbn;

    // Getter para el campo 'id'.
    public String getId() {
        return id;
    }

    // Setter para el campo 'id'.
    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
