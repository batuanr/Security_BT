package com.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String name;
    private String pass;
    @ManyToOne
    @JoinColumn
    private  Role role;

    public User(Long id, String name, String pass, Role role) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public User(String name, String pass, Role role) {
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
