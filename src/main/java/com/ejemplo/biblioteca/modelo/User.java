package com.ejemplo.biblioteca.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

// La clase User representa a un usuario en el sistema.
public class User {

    // La anotación @Id indica que el campo 'id' es la clave primaria en la base de datos.
    // La anotación @GeneratedValue especifica que el valor del campo 'id' se generará automáticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
