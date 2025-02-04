package com.mendes.Livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mendes.Livraria.dto.AuthorDTO;
import com.mendes.Livraria.entities.Author;
import com.mendes.Livraria.repositories.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Transactional(readOnly = true)
    public List<AuthorDTO> getAllAuthors() {
        return authorRepository.findAll().stream().map(AuthorDTO::fromEntity).toList();
    }

    @Transactional(readOnly = true)
    public AuthorDTO getAuthorById(Long id) {
        Author author = authorRepository.findById(id).get();
        return AuthorDTO.fromEntity(author);
    }

    @Transactional
    public void saveAuthor(AuthorDTO dto) {
        authorRepository.save(dto.toAuthor());
    }
    
}
