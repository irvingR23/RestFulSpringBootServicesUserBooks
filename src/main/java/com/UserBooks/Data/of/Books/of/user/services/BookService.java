/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.services;

import com.UserBooks.Data.of.Books.of.user.models.Book;
import com.UserBooks.Data.of.Books.of.user.repositories.BookRepository;
import com.UserBooks.Data.of.Books.of.user.response.SaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Irving
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public SaveResponse storeBook(Book book){
        Book exists=null;
        exists=bookRepository.findByName(book.getName());
        if(exists==null){
            bookRepository.save(book);
            exists=bookRepository.findByName(book.getName());
            return new SaveResponse("Book", exists.getIdBook(), true);
        }else{
            return new SaveResponse("", 0, false);
        }
    }
}
