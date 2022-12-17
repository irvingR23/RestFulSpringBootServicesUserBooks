/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Irving
 */
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    private long idBook;
    private String name;
    private int numberOfPages;
    private String author;
    private String comments;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "book")
    @JsonProperty(access = Access.WRITE_ONLY)
    private List<UserBooks> userBooks;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idGenre",nullable = false)
    private Genre genre;

    public Book(long idBook, String name, int numberOfPages, String author, String comments) {
        this.idBook = idBook;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
    }

    public Book(long idBook, String name, int numberOfPages, String author, String comments, List<UserBooks> userBooks, Genre genre) {
        this.idBook = idBook;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
        this.userBooks = userBooks;
        this.genre = genre;
    }

    public Book(String name, int numberOfPages, String author, String comments, List<UserBooks> userBooks, Genre genre) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
        this.userBooks = userBooks;
        this.genre = genre;
    }
    
    

    public Book(long idBook, String name, int numberOfPages, String author, String comments, List<UserBooks> userBooks) {
        this.idBook = idBook;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
        this.userBooks = userBooks;
    }

    public Book(String name, int numberOfPages, String author, String comments, List<UserBooks> userBooks) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
        this.userBooks = userBooks;
    }
    
    

    public Book(String name, int numberOfPages, String author, String comments) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.comments = comments;
    }
    
    public Book(){
        this("",0,"","");
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<UserBooks> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(List<UserBooks> userBooks) {
        this.userBooks = userBooks;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", name=" + name + ", numberOfPages=" + numberOfPages + ", author=" + author + ", comments=" + comments + ", genre=" + genre.toString() + '}'+
                System.getProperty("line.separator");
    }
    

    
    
}
