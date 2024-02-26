package com.unibet.workshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unibet.workshop.persistence.entity.Car;

public class RestCar {

    @JsonIgnore
    private Long id;
    private String numberPlate;

    public RestCar() {
    }

    public RestCar(Car car) {
        this.id = car.getId();
        this.numberPlate = car.getNumberPlate();
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

    public Car toJpa() {
        Car car = new Car();
        car.setNumberPlate(numberPlate);
        return car;
    }
}