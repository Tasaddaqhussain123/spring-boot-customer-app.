package com.klef.jfsd.exam.controller;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "customers")
public class CustomerController {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    // Getters and Setters
}
