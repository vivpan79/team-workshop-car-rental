package com.unibet.workshop.persistence.repository;

import com.unibet.workshop.Application;
import com.unibet.workshop.persistence.entity.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("dev")
public class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void givenCarRepositoryWhenSaveAndRetrieveCarEntityThenExactMatch() {
        Car entity = new Car();
        entity.setNumberPlate("ABC-123");
        Car savedCar = carRepository.save(entity);
        Optional<Car> retrievedCar = carRepository.findById(savedCar.getId());
        assertTrue(retrievedCar.isPresent());
        assertEquals("ABC-123", retrievedCar.get().getNumberPlate());
    }
}
