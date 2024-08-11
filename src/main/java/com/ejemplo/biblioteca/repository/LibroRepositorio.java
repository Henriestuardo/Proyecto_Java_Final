package com.ejemplo.biblioteca.repository;

import com.ejemplo.biblioteca.modelo.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibroRepositorio extends MongoRepository<Book, String> {
}
