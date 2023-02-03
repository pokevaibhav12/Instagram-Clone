package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "userID")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "postId")
    private Posts image;

    private Timestamp dateLiked;
    private Timestamp dateUpdated;
}
