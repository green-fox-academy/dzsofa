package com.greenfox.frontend.models;

import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.ArrayList;

public class DoUntil {
    private int until;

    public DoUntil() {
    }

    public DoUntil(int until) {
        this.until = until;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }

    public ResultNumber getResult(String action) {
        if (action.equals("sum")) {
            return new ResultNumber(this.getSum());
        } else if (action.equals("factor")) {
            return new ResultNumber(this.getFactor());
        }	else throw new HttpMessageNotReadableException("Please provide a number!");
    }

    public Integer getSum() {
        Integer result = 0;
        for (int i = 1; i <= this.getUntil(); i++) {
            result += i;
        }
        return result;
    }

    public Integer getFactor() {
        Integer result = 1;
        for (int i = 1; i <= this.getUntil(); i++) {
            result *= i;
        }
        return result;
    }
}
