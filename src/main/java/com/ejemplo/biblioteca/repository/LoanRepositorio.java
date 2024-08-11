package com.ejemplo.biblioteca.repository;

import com.ejemplo.biblioteca.modelo.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositorio extends JpaRepository<Loan, Long> {
}
