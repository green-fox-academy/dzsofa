package com.greenfox.orientationpractice.services;

import com.greenfox.orientationpractice.models.Car;
import com.greenfox.orientationpractice.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    @Autowired
    CarRepo repo;

    public List<Car> getCars() {
        return repo.findAll();
    }

    public List<Car> findCarsByPlate(String q) {
        return repo.findAllByPlateIsLike(q);
    }

    public List<Car> findPolice() {
        return repo.findAllByPlateIsLike("RB%");
    }

    public List<Car> findDiplomat() {
        return repo.findAllByPlateIsLike("DT%");
    }
}
