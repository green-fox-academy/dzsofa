package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.Error;
import com.greenfox.frontend.models.Doubling;
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
    public Greet

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Error missingErrorMessage() {
        Error missingParamError = new Error();
        missingParamError.setError("Please provide an input!");
        return missingParamError;
    }
}
