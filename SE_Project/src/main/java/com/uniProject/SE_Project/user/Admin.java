package com.uniProject.SE_Project.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
    Integer id = 122;
    String name = "admin";
    String email = "admin12@gmail.com";

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;

    }
}


