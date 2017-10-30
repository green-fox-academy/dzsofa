package com.greenfox.foxclub.model;

public enum Food {
    SALAD,
    GRASS,
    FRUIT,
    ANT,
    FLY,
    MOUSE;

    Food() {

    }

    public String getName() {
        return Food.values().toString();
    }
}
