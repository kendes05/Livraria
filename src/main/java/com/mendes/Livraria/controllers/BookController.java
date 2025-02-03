package com.mendes.Livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mendes.Livraria.dto.BookDTO;
import com.mendes.Livraria.services.BookServices;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServices bookService;

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(value = "/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public void saveBook(@RequestBody BookDTO dto){
        bookService.saveBook(dto);
    }

    @PutMapping
    public void updateBook(@RequestBody BookDTO dto){
        bookService.updateBook(dto);
    }

    @DeleteMapping
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
    
}
