package com.mendes.Livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mendes.Livraria.entities.Belonging;
import com.mendes.Livraria.entities.BelongingPK;

public interface BelongingRepository extends JpaRepository<Belonging,BelongingPK>{
    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "INSERT INTO Belonging (book_id, author_id) VALUES (:book_id,:author_id)")
    void addBook(Long book_id, Long author_id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "DELETE FROM Belonging WHERE book_id = :book_id")
    void deleteBook(Long book_id);
}
