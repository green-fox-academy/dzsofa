package com.greenfox.todos.repository;

import com.greenfox.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Integer>{
}
