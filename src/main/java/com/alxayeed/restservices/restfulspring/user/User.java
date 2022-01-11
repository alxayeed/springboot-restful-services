package com.alxayeed.restservices.restfulspring.user;

import lombok.Data;

import java.util.Date;


public class User {
    private int id;
    private String name;
    private Date birthDAte;

    public User(int id, String name, Date birthDAte) {
        this.id = id;
        this.name = name;
        this.birthDAte = birthDAte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDAte() {
        return birthDAte;
    }

    public void setBirthDAte(Date birthDAte) {
        this.birthDAte = birthDAte;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDAte=" + birthDAte +
                '}';
    }
}
