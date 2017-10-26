package com.greenfox.error.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greenfox.error.model.controller.*;

@SpringBootApplication
public class FinderApplication implements CommandLineRunner {

    @Autowired
    AppController appController;

    public static void main(String[] args) {
        SpringApplication.run(FinderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
