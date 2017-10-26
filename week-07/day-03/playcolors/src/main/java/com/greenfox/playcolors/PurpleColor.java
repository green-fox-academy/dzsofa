package com.greenfox.playcolors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurpleColor implements myColors {

    @Override
    public void printColor() {
        System.out.println("I am cute purple.");
    }
}
