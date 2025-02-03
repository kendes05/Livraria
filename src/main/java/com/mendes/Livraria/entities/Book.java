package com.mendes.Livraria.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    
    private String genre;
    private String title;
    private Integer bookYear;
    private String imgUrl;
    
    public Book() {
        
    }
    
    public Book(Long id, Author author, String genre, String title, Integer bookYear, String imgUrl) {
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.bookYear = bookYear;
        this.imgUrl = imgUrl;
    }

    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getBookYear() {
        return bookYear;
    }
    public void setBookYear(Integer bookYear) {
        this.bookYear = bookYear;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
