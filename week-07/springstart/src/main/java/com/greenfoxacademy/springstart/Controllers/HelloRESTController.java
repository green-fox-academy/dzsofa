package com.greenfoxacademy.springstart.Controllers;

import org.omg.CORBA.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greet(@RequestParam String name) {
        Greeting greeting = new Greeting(1, "Hello, " + name);
        return greeting;
    }
}
