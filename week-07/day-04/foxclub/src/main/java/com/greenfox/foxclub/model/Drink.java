package com.greenfox.foxclub.model;

public enum Drink {
    COKE,
    WATER,
    SPRITE,
    ENERGYDRINK,
    FANTA,
    GINGERALE;

    Drink() {
    }

    public String getName() {
        return Drink.values().toString();
    }

}
