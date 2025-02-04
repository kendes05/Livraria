package com.mendes.Livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mendes.Livraria.dto.BookDTO;
import com.mendes.Livraria.entities.Book;
import com.mendes.Livraria.repositories.BelongingRepository;
import com.mendes.Livraria.repositories.BookRepository;


@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BelongingRepository belongingRepository;



    @Transactional(readOnly = true)
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream().map(BookDTO::fromEntity).toList();
    }

    @Transactional(readOnly = true)
    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id).get();
        return BookDTO.fromEntity(book);
    }

    @Transactional
    public void saveBook(BookDTO dto, Long authorId) {
        Book book = bookRepository.save(dto.toBook());
        belongingRepository.addBook(book.getId(), authorId);
    }

    @Transactional
    public void updateBook(BookDTO dto, Long authorId) {
        saveBook(dto,authorId);
    }

    @Transactional
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
        belongingRepository.deleteBook(id);
    }
}
