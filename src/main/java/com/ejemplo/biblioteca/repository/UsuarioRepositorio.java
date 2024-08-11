package com.ejemplo.biblioteca.repository;

import com.ejemplo.biblioteca.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<User, Long> {
}
