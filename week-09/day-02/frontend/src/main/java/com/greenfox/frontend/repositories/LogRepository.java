package com.greenfox.frontend.repositories;

import com.greenfox.frontend.models.Log;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log, Long>{

    List<Log> findAll();

    @Query(value = "SELECT * FROM log ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
    Iterable<Log> getPostsByPage(int pageId);

}
