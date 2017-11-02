package com.greenfox.connecttomysql.Service;

import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {

    @Autowired
    TodoRepo todoRepo;


    public List<Todo> listThem(Boolean isActive) {
        List<Todo> todos = new ArrayList<>();
        for (Todo todo : todoRepo.findAll()) {
            if (isActive == null) {
                todos.add(todo);
            } else if (isActive) {
                if (!todo.getIsDone()) {
                    todos.add(todo);
                }
            } else if (!isActive) {
                if (todo.getIsDone()) {
                    todos.add(todo);
                }
            }
        }
        return todos;
    }
}
