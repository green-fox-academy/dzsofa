package com.greenfox.hellobeanworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = appContext.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World");
        helloWorld.getMessage();

    }
}
