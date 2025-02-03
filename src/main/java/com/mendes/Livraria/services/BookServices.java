package com.mendes.Livraria.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mendes.Livraria.dto.BookDTO;
import com.mendes.Livraria.entities.Author;
import com.mendes.Livraria.entities.Book;
import com.mendes.Livraria.repositories.BookRepository;


@Service
public class BookServices {
    
    @Autowired
    private BookRepository bookRepository;


    @Transactional(readOnly = true)
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(BookDTO::fromEntity).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public BookDTO getBookById(Long id) {
        return bookRepository.findById(id).map(BookDTO::fromEntity).get();
    }

    @Transactional
    public void saveBook(BookDTO bookDTO) {
        Book book = bookDTO.toBook();
        bookRepository.save(book);
    }

    @Transactional
    public void updateBook(BookDTO bookDTO) {
        saveBook(bookDTO);
    }

    @Transactional
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
