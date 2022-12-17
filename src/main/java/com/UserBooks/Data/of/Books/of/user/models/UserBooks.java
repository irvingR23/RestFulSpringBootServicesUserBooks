/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Irving
 */
@Entity
@Table(name = "UsersBooks")
public class UserBooks {
    @Id
    @GeneratedValue
    private long idUserBooks;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idBook",nullable = false)
    private Book book;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser",nullable = false)
    private User user;

    public UserBooks(long idUserBooks, Book book, User user) {
        this.idUserBooks = idUserBooks;
        this.book = book;
        this.user = user;
    }

    public UserBooks(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public UserBooks() {
        this(null,null);
    }

    public long getIdUserBooks() {
        return idUserBooks;
    }

    public void setIdUserBooks(long idUserBooks) {
        this.idUserBooks = idUserBooks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserBooks{" + "idUserBooks=" + idUserBooks + ", book=" + book.toString() + ", user=" + user.toString() + '}'+
                System.getProperty("line.separator");
    }
    
    
}
