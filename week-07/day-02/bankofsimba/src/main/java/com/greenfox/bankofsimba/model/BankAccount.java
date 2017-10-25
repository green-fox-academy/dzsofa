package com.greenfox.bankofsimba.model;

public class BankAccount {
    String name;
    float balance;
    String animalType;

    public BankAccount(String name, float balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
