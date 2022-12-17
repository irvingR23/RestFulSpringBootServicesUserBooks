/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.repositories;

import com.UserBooks.Data.of.Books.of.user.models.Genre;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Irving
 */
public interface GenreRepository extends CrudRepository<Genre, Long>{
    List<Genre> findByName(String name);
}
