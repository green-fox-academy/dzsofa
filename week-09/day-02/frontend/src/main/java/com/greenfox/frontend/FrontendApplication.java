package com.greenfox.frontend;

import com.greenfox.frontend.repositories.LogRepository;
import com.greenfox.frontend.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner {

    @Autowired
    LogRepository logRepository;

    @Autowired
    LogService logService;

    public static void main(String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
