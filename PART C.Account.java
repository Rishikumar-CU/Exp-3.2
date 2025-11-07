package com.example.entity;

import jakarta.persistence.*;

// Author: RISHI KUMAR | UID: 23BCS14134

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "balance")
    private double balance;

    public Account() {}

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void setHolderName(String holderName) { this.holderName = holderName; }
    public void setBalance(double balance) { this.balance = balance; }
}
