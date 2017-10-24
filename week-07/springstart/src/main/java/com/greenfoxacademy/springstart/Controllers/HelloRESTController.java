package com.greenfoxacademy.springstart.Controllers;

import org.omg.CORBA.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greet(@RequestParam String name) {
        Greeting greeting = new Greeting(atomicLong.incrementAndGet(), "Hello, " + name);
        return greeting;
    }
}
