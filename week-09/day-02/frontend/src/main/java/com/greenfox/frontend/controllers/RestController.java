package com.greenfox.frontend.controllers;

import com.greenfox.frontend.exceptions.GlobalExceptionHandler;
import com.greenfox.frontend.models.*;
import com.greenfox.frontend.repositories.LogRepository;
import com.greenfox.frontend.services.LogService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


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
        logService.saveGetMappingLog(request);
        return doubling;
    }

    @GetMapping("/greeter")
    public Greeting greeting(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title, HttpServletRequest request) {
        Greeting greeting = new Greeting(name, title);
        greeting.setWelcome_message();
        logService.saveGetMappingLog(request);
        return greeting;
    }

    @GetMapping("/appenda/{appendable}")
    public Appenda appenda(@PathVariable String appendable, HttpServletRequest request) {
        Appenda appenda = new Appenda(appendable);
        logService.saveGetMappingLogWithPathVariable(request, appendable);
        return appenda;
    }

    @PostMapping("/dountil/{what}")
    public ResultNumber doUntil(@PathVariable String what, @RequestBody DoUntil doUntil, HttpServletRequest request) {
        ResultNumber resultNumber = doUntil.getResult(what);
        logService.savePostMappingLog(request, doUntil);
        return resultNumber;
    }

    @PostMapping("/arrays")
    public Object operateOnArrays(@RequestBody ArrayHandler handler, HttpServletRequest request) {
        Object result = handler.getResult();
        logService.savePostMappingLog(request, handler);
        return result;
    }

    @GetMapping("/log")
    public History getAllLog() {
        List<Log> entries = new ArrayList<>();
        for (Log entry : logService.getAll()) {
            entries.add(entry);
        }
        return new History(entries);
    }

}
