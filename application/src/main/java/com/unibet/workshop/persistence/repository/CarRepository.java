package com.unibet.workshop.persistence.repository;

import com.unibet.workshop.persistence.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long>{
    Optional<Car> findByNumberPlate(String numberPlate);
}
