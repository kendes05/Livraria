package com.mendes.Livraria.dto;

import com.mendes.Livraria.entities.Book;

public class BookDTO {
    private Long id;
    private String title;
    private Integer bookYear;
    private String genre;
    private String imgUrl;

    public BookDTO() {}

    public BookDTO(Long id, String title, Integer bookYear, String genre, String imgUrl) {
        this.id = id;
        this.title = title;
        this.bookYear = bookYear;
        this.genre = genre;
        this.imgUrl = imgUrl;
    }

    public Book toBook(){
        Book book = new Book();
        book.setId(this.id);
        book.setTitle(this.title);
        book.setBookYear(this.bookYear);
        book.setGenre(this.genre);
        book.setImgUrl(this.imgUrl);
    
        return book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public static BookDTO fromEntity(Book book) {
        return new BookDTO(
            book.getId(),
            book.getTitle(),
            book.getBookYear(),
            book.getGenre(),
            book.getImgUrl()
        );
    }

}
