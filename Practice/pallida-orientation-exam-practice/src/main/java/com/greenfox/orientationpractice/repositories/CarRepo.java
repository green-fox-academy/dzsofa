package com.greenfox.orientationpractice.repositories;

import com.greenfox.orientationpractice.models.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long>{

    List<Car> findAll();
}
