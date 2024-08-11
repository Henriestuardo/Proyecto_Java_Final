package com.ejemplo.biblioteca.repository;

// Importa la clase User que representa el modelo de datos para los usuarios.
import com.ejemplo.biblioteca.modelo.User;

// Importa la interfaz JpaRepository de Spring Data JPA.
import org.springframework.data.jpa.repository.JpaRepository;

// La interfaz UsuarioRepositorio extiende JpaRepository para proporcionar operaciones CRUD básicas para el modelo User.
// JpaRepository proporciona métodos para realizar operaciones de persistencia en una base de datos relacional.
public interface UsuarioRepositorio extends JpaRepository<User, Long> {
}
