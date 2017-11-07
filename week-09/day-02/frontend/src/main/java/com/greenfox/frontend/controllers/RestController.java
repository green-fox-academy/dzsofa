package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.*;
import com.greenfox.frontend.models.Error;
import org.springframework.http.converter.HttpMessageNotReadableException;
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

    @GetMapping("/appenda/{appendable}")
    public Appenda appenda(@PathVariable String appendable) {
        Appenda appenda = new Appenda(appendable);
        return appenda;
    }

    @PostMapping("/dountil/{what}")
    public ResultNumber doUntil(@PathVariable String what, @RequestBody DoUntil doUntil) {
        ResultNumber result = new ResultNumber();

        if (what.equals("sum")) {
            for (int i = 1; i <= doUntil.getUntil(); i++) {
                result.setResult(result.getResult() + i);
            }
        }
        if (what.equals("factor")) {
            result.setResult(1);
            for (int i = 1; i <= doUntil.getUntil(); i++) {
                result.setResult(result.getResult() * i);
            }
        }
        System.out.println(result.getResult());
        return result;
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

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Error missingHttpMessage(HttpMessageNotReadableException ex) {
        Error missingHttp = new Error();
        missingHttp.setError("Please provide a number!");
        return missingHttp;
    }
}
