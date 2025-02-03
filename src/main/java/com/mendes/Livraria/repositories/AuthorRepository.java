package com.mendes.Livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.Livraria.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}
