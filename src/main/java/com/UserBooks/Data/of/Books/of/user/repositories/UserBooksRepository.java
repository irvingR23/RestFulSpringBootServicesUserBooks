/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.repositories;

import com.UserBooks.Data.of.Books.of.user.models.UserBooks;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Irving
 */
public interface UserBooksRepository extends CrudRepository<UserBooks, Long>{
    
}
