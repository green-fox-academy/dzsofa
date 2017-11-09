package com.greenfox.frontend.repositories;

import com.greenfox.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log, Long>{

    List<Log> findAll();
}
