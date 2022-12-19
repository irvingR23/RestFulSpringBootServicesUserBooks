/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserBooks.Data.of.Books.of.user.response;

/**
 *
 * @author Irving
 */
public class UpdateResponse {
    private String  object;
    private long id;
    private boolean updated;

    public UpdateResponse(String object, long id, boolean updated) {
        this.object = object;
        this.id = id;
        this.updated = updated;
    }
    
    public UpdateResponse(String object, long id) {
        this(object,id,false);
    }
    
    public UpdateResponse(String object) {
        this(object,0,false);
    }
    
    public UpdateResponse() {
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

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "UpdateResponse{" + "object=" + object + ", id=" + id + ", updated=" + updated + '}';
    }

    
    
    
}
