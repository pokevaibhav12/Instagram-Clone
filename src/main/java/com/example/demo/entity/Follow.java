package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fromId")
    private Users userFrom;
    @ManyToOne
    @JoinColumn(name = "toId")
    private Users userTo;
    private boolean follow;
    private Timestamp dateFollowed;
}
