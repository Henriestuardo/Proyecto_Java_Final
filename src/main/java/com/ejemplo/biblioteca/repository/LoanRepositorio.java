package com.ejemplo.biblioteca.repository;

// Importa la clase Loan que representa el modelo de datos para los préstamos.
import com.ejemplo.biblioteca.modelo.Loan;

// Importa la interfaz JpaRepository de Spring Data JPA.
import org.springframework.data.jpa.repository.JpaRepository;

// La interfaz LoanRepositorio extiende JpaRepository para proporcionar operaciones CRUD básicas para el modelo Loan.
// JpaRepository proporciona métodos para realizar operaciones de persistencia en una base de datos relacional.
public interface LoanRepositorio extends JpaRepository<Loan, Long> {
}
