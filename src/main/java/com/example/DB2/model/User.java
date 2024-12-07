package com.example.DB2.model;


import jakarta.persistence.*;

//user model view object
@Entity //converts the object this class to a table
@Table(name="Users")
public class User {

    @Id //the columns of the table
    private int id;
    private String name;

    public String toString(){
        return name+" : "+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
