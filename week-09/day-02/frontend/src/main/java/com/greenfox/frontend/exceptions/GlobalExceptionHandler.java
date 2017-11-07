package com.greenfox.frontend.exceptions;

import com.greenfox.frontend.models.Error;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class GlobalExceptionHandler     {

    @org.springframework.web.bind.annotation.ExceptionHandler(MissingServletRequestParameterException.class)
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

    @org.springframework.web.bind.annotation.ExceptionHandler(HttpMessageNotReadableException.class)
    public Error missingHttpMessage(HttpMessageNotReadableException ex) {
        Error missingHttp = new Error();
        missingHttp.setError("Please provide a number!");
        return missingHttp;
    }
}
