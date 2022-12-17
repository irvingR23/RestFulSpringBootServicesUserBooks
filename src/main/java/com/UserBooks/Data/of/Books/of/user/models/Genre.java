/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Irving
 */
@Entity
@Table(name = "Genres")
public class Genre {
    @Id
    @GeneratedValue
    private long idGenre;
    private String name;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "genre")
    @JsonProperty(access = Access.WRITE_ONLY)
    private List<Book> books;

    public Genre(long idGenre, String name) {
        this.idGenre = idGenre;
        this.name = name;
    }

    public Genre(long idGenre, String name, List<Book> books) {
        this.idGenre = idGenre;
        this.name = name;
        this.books = books;
    }

    public Genre(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Genre(String name) {
        this.name = name;
    }
    
    public Genre(){
        this("");
    }

    public long getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(long idGenre) {
        this.idGenre = idGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Genre{" + "idGenre=" + idGenre + ", name=" + name + '}'+
                System.getProperty("line.separator");
    }
    
    
}
