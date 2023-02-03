package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String caption;
    private String imagePath;
    @ManyToOne
    @JoinColumn(name="userId")
    private Users user;
    @OneToMany(mappedBy = "image")
    private List<Likes> likesList = new ArrayList<>();
    private int countLike;
    private boolean heart;
    private Timestamp uploadDate;
    private Timestamp dateUpdated;
}
