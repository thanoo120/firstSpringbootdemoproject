package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
