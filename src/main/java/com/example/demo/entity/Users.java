package com.example.demo.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    @NotNull
    private String userName;
    private String fullName;
    private String password;
    private String email;
    private String profilePath;
    private String gender;
    @OneToMany(mappedBy = "user")
    private List<Posts> images = new ArrayList<Posts>();
    private Timestamp dateCreated;
    private Timestamp dateUpdated;
    public Users(){
        super();
    }

    public Users(int userId, String userName, String fullName, String password, String email, String profilePath) {
        super();
        this.id = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.profilePath = profilePath;
    }

    public int getUserId() {
        return id;
    }

    public void setUserId(int userId) {
        this.id = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }
}

