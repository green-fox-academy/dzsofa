package com.greenfox.frontend.controllers;

import com.greenfox.frontend.exceptions.GlobalExceptionHandler;
import com.greenfox.frontend.models.*;
import com.greenfox.frontend.repositories.LogRepository;
import com.greenfox.frontend.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@org.springframework.web.bind.annotation.RestController
public class RestController extends GlobalExceptionHandler {

    @Autowired
    LogRepository logRepository;

    @Autowired
    LogService logService;

    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam(value = "input") int input, HttpServletRequest request) {
        Doubling doubling = new Doubling(input);
        doubling.setResult(input * 2);
        logRepository.save(new Log(request.getServletPath(), request.getRequestURI()));
        return doubling;
    }

    @GetMapping("/greeter")
    public Greeting greeting(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
        Greeting greeting = new Greeting(name, title);
        greeting.setWelcome_message();
        return greeting;
    }

    @GetMapping("/appenda/{appendable}")
    public Appenda appenda(@PathVariable String appendable) {
        Appenda appenda = new Appenda(appendable);
        return appenda;
    }

    @PostMapping("/dountil/{what}")
    public ResultNumber doUntil(@PathVariable String what, @RequestBody DoUntil doUntil) {
        ResultNumber resultNumber = doUntil.getResult(what);
        return resultNumber;
    }

    @PostMapping("/arrays")
    public Object operateOnArrays(@RequestBody ArrayHandler handler) {
        Object result = handler.getResult();
        return result;
    }

}
