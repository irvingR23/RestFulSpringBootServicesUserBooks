/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.response;

/**
 *
 * @author Irving
 */
public class SaveResponse {
    private String  object;
    private long id;
    private boolean saved;

    public SaveResponse(String object, long id, boolean saved) {
        this.object = object;
        this.id = id;
        this.saved = saved;
    }
    
    public SaveResponse(String object, long id) {
        this(object,id,false);
    }
    
    public SaveResponse(String object) {
        this(object,0,false);
    }
    
    public SaveResponse(){
        this("",0,false);
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    @Override
    public String toString() {
        return "SaveResponse{" + "object=" + object + ", id=" + id + ", saved=" + saved + '}';
    }
    
    
}
