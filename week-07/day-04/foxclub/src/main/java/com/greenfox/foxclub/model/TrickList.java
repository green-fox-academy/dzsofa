package com.greenfox.foxclub.model;

import java.util.ArrayList;

public class TrickList {
    ArrayList<Trick> tricks;


    public TrickList(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }

    public void getTrick(int index) {
        this.tricks.get(index).getTrickName();
    }
}
