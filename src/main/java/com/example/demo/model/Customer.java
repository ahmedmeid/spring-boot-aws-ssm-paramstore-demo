package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String mobileNo;
    String address;

}
