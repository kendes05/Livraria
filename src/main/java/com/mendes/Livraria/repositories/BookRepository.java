package com.mendes.Livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.Livraria.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
