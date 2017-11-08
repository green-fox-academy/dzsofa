package com.greenfox.frontend.models;

import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
    private String what;
    private List<Integer> numbers;


    public ArrayHandler() {
    }

    public ArrayHandler(String what, List<Integer> numbers) {
        this.what = what;
        this.numbers = new ArrayList<>();
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Object getResult() {
        if (what.equals("sum")) {
            return new ResultNumber(this.getSum());
        } else if (what.equals("multiply")) {
            return new ResultNumber(this.getMultiply());
        } else if (what.equals("double")) {
            return new ResultList(this.getDouble());
        } else
            throw new HttpMessageNotReadableException("Please provide a number!");
    }

    public Integer getSum() {
        Integer result = 0;
        for (int i = 0; i <= this.numbers.size() - 1; i++) {
            result += this.numbers.get(i);
        }
        return result;
    }

    public Integer getMultiply() {
        Integer result = 1;
        for (int i = 0; i <= this.numbers.size() - 1; i++) {
            result *= this.numbers.get(i);
        }
        return result;
    }


    private List<Integer> getDouble() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < this.getNumbers().size(); i++) {
            result.add(getNumbers().get(i) * 2);
        }
        return result;
    }
}
