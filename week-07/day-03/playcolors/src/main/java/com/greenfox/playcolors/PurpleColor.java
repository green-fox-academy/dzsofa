package com.greenfox.playcolors;

import org.springframework.stereotype.Component;

@Component
public class PurpleColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("I am cute purple.");
    }
}
