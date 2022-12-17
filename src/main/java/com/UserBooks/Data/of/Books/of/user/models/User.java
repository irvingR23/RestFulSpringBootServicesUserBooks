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
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Irving
 */
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue
    private long idUser;
    private String name;
    private String user;
    private java.sql.Date birthdate;
    private int age;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    @JsonProperty(access = Access.WRITE_ONLY)
    private List<UserBooks> userBooks;

    public User(long idUser, String name, String user, Date birthdate, int age) {
        this.idUser = idUser;
        this.name = name;
        this.user = user;
        this.birthdate = birthdate;
        this.age = age;
    }

    public User(long idUser, String name, String user, Date birthdate, int age, List<UserBooks> userBooks) {
        this.idUser = idUser;
        this.name = name;
        this.user = user;
        this.birthdate = birthdate;
        this.age = age;
        this.userBooks = userBooks;
    }

    public User(String name, String user, Date birthdate, int age, List<UserBooks> userBooks) {
        this.name = name;
        this.user = user;
        this.birthdate = birthdate;
        this.age = age;
        this.userBooks = userBooks;
    }
    
    public User(String name, String user,Date birthdate, int age){
        this.name=name;
        this.user=user;
        this.birthdate=birthdate;
        this.age=age;
    }
    
    public User(){
        this("","",Date.valueOf(""),0);
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<UserBooks> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(List<UserBooks> userBooks) {
        this.userBooks = userBooks;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", name=" + name + ", user=" + user + ", birthdate=" + birthdate + ", age=" + age + '}'+
                System.getProperty("line.separator");
    }
    
    
}
