package com.greenfox.playcolors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PlaycolorsApplication {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(PurpleColor.class);

        PurpleColor purpleColor = appContext.getBean(PurpleColor.class);
        purpleColor.printColor();
    }
}
