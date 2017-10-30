package com.greenfox.foxclub.configurator;

import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.model.Trick;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

import static com.greenfox.foxclub.model.Food.*;

@Component
public class FoxConfigurator {

    @Bean
    public Fox myFox() {
        return new Fox("Fixi-foxi", new ArrayList<>(), Food.ANT, Drink.COKE, 0);
    }

    @Bean
    public Trick myTrick() {
        return new Trick();
    }

}
