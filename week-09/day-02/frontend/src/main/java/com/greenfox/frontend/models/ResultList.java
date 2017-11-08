package com.greenfox.frontend.models;

import java.util.List;

public class ResultList {
    private List<Integer> result;


    public ResultList(List<Integer> result) {
        this.result = result;
    }

    public ResultList() {
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }


}
