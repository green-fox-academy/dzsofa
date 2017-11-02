package com.greenfox.connecttomysql;

import com.greenfox.connecttomysql.models.Assignee;
import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.AssigneeRepo;
import com.greenfox.connecttomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnecttomysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepo todoRepo;

    @Autowired
    AssigneeRepo assigneeRepo;


    public static void main(String[] args) {
        SpringApplication.run(ConnecttomysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        todoRepo.save(new Todo("smell carrots"));
//        todoRepo.save(new Todo("clean flat"));
//        assigneeRepo.save(new Assignee("Zsofi", "pelda@pelda.com"));
    }
}

