package com.greenfox.connecttomysql.repository;

import com.greenfox.connecttomysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long>{

    List<Todo> findAllByTitleContaining(String searchTerm);

//    List<Todo> findAllByAssignee(String assignee);


}
