package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.Error;
import com.greenfox.frontend.models.Doubling;
import com.greenfox.frontend.models.Greeting;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam(value = "input") int input) {
        Doubling doubling = new Doubling(input);
        doubling.setResult(input * 2);
        return doubling;
    }

    @GetMapping("/greeter")
    public Greeting greeting(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
        Greeting greeting = new Greeting(name, title);
        greeting.setWelcome_message();
        return greeting;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Error missingErrorMessage(MissingServletRequestParameterException ex) {
        Error missingParamError = new Error();
        if (ex.getParameterName().equals("input")) {
            missingParamError.setError("Please provide an input!");
        } else if (ex.getParameterName().equals("name")) {
            missingParamError.setError("Please provide a name!");
        } else if (ex.getParameterName().equals("title")) {
            missingParamError.setError("Please provide a title!");
        }
        return missingParamError;
    }
}
