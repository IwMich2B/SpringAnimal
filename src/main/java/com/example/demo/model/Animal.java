package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String rasa;
}
