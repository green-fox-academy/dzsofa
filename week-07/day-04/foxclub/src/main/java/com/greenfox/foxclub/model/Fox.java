package com.greenfox.foxclub.model;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

public class Fox {
    private String name;
    private ArrayList<Trick> myTricks;
    private Food myFood;
    private Drink myDrink;
    private int knownTricks;

    public Fox() {
        this.name = "Fixi-foxi";
        this.myTricks = new ArrayList<>();
        myFood = null;
        myDrink = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Trick> getMyTricks() {
        return myTricks;
    }

    public int getKnownTricks() {
        return myTricks.size();
    }

    public void addTrick(Trick trick) {
        this.myTricks.add(trick);
    }

    public Food getMyFood() {
        return myFood;
    }

    public void setMyFood(Food myFood) {
        this.myFood = myFood;
    }

    public Drink getMyDrink() {
        return myDrink;
    }

    public void setMyDrink(Drink myDrink) {
        this.myDrink = myDrink;
    }
}
