package com.mendes.Livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mendes.Livraria.dto.AuthorDTO;
import com.mendes.Livraria.services.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;

    @PostMapping
    public void saveAuthor(@RequestBody AuthorDTO dto) {
        authorService.saveAuthor(dto);
    }

    @GetMapping
    public List<AuthorDTO> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping(value = "{id}")
    public AuthorDTO getAuthorById(@PathVariable Long id){
        return authorService.getAuthorById(id);
    }
}
