package com.greenfox.orientationpractice.repositories;

import com.greenfox.orientationpractice.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Long>{
}
