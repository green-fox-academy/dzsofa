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

    }

    public Fox(String name, ArrayList<Trick> myTricks, Food myFood, Drink myDrink, int knownTricks) {
        this.name = name;
        this.myTricks = myTricks;
        this.myFood = myFood;
        this.myDrink = myDrink;
        this.knownTricks = knownTricks;
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

    public void addTrick(String desc) {
        this.myTricks.add(new Trick(desc));
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
