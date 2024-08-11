package com.ejemplo.biblioteca.repository;

// Importa la clase Book que representa el modelo de datos para los libros.
import com.ejemplo.biblioteca.modelo.Book;

// Importa la interfaz MongoRepository de Spring Data MongoDB.
import org.springframework.data.mongodb.repository.MongoRepository;

// La interfaz LibroRepositorio extiende MongoRepository para proporcionar operaciones CRUD básicas para el modelo Book.
// MongoRepository proporciona métodos para realizar operaciones de persistencia en MongoDB.
public interface LibroRepositorio extends MongoRepository<Book, String> {
}
