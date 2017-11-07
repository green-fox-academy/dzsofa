package com.greenfox.connecttomysql.repository;

import com.greenfox.connecttomysql.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {

    List<Todo> findAllByTitleContaining(String searchTerm);

    @Query(value = "SELECT * FROM todos LEFT OUTER JOIN assignees ON todos.assignee_id = assignees.id WHERE title LIKE %?1% OR name LIKE %?1%", nativeQuery = true)
    List<Todo> findTitleAndAssignee(String searchTerm);
}
