package com.mendes.Livraria.dto;

import java.util.List;

import com.mendes.Livraria.entities.Author;
import com.mendes.Livraria.entities.Book;

public class AuthorDTO {
    private Long id;
    private String name;
    private String nationality;
    private String birthDate;
    private String deathDate;
    private String biography;
    private String imgUrl;
    private List<Book> bookTitles;

    public AuthorDTO() {}

    

    public AuthorDTO(Long id, String name, String nationality, String birthDate, String deathDate, String biography,
            String imgUrl, List<Book> bookTitles) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.biography = biography;
        this.imgUrl = imgUrl;
        this.bookTitles = bookTitles;
    }

    public Author toAuthor(){
        return new Author(this.id, this.name, this.nationality, this.birthDate, this.deathDate, this.biography, this.imgUrl,this.bookTitles);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Book> getBookTitles() {
        return bookTitles;
    }

    public void setBookTitles(List<Book> bookTitles) {
        this.bookTitles = bookTitles;
    }

    public String getImgUrl() {
            return imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
    }

    public static AuthorDTO fromEntity(Author author) {
        return new AuthorDTO(
            author.getId(),
            author.getName(),
            author.getNationality(),
            author.getBirthDate(),
            author.getDeathDate(),
            author.getBiography(),
            author.getImgUrl(),
            author.getBooks()
        );
    }


}
