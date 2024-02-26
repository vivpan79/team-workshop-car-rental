package com.unibet.workshop.controller;

import com.unibet.workshop.model.RestCar;
import com.unibet.workshop.model.RestCars;
import com.unibet.workshop.persistence.entity.Car;
import com.unibet.workshop.persistence.repository.CarRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    @ApiOperation(
            value = "Get all registered Cars information.",
            notes = "Get all registered Cars information.",
            response = RestCars.class)
    public RestCars getAll() {
        List<Car> cars = carRepository.findAll();
        List<RestCar> restCars = cars.stream().map(RestCar::new).collect(Collectors.toList());
        return restCars.isEmpty() ? new RestCars() : new RestCars(restCars);
    }

    @PostMapping("/register")
    @ApiOperation(
            value = "Register a Car.",
            notes = "Register a Car.",
            response = RestCar.class)
    public RestCar registerCar(
            @ApiParam(value = "Car information")
            @RequestBody RestCar car
    ) {
        Car savedCar = carRepository.save(car.toJpa());
        return new RestCar(savedCar);
    }
}
