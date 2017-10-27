package com.greenfox.foxclub.model;

public class Fox {
    private String name;
    private TrickList myTricks;
    private Food myFood;
    private Drink myDrink;

    public Fox(String name, TrickList myTricks, Food myFood, Drink myDrink) {
        this.name = name;
        this.myTricks = myTricks;
        this.myFood = myFood;
        this.myDrink = myDrink;
    }
}
