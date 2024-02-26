package com.unibet.workshop.persistence.entity;


import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "number_plate", unique = true)
    private String numberPlate;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
