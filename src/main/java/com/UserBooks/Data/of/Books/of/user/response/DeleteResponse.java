/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.response;

/**
 *
 * @author Irving
 */
public class DeleteResponse {
    private String  object;
    private long id;
    private boolean deleted;

    public DeleteResponse(String object, long id, boolean deleted) {
        this.object = object;
        this.id = id;
        this.deleted = deleted;
    }
    
    public DeleteResponse(String object, long id) {
        this(object,id,false);
    }
    
    public DeleteResponse(String object) {
        this(object,0,false);
    }
    
    public DeleteResponse() {
        this("",0,false);
    }

    @Override
    public String toString() {
        return "DeleteResponse{" + "object=" + object + ", id=" + id + ", deleted=" + deleted + '}';
    }
    
    
}
