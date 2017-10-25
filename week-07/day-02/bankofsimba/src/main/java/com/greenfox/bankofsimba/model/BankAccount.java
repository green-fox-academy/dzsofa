package com.greenfox.bankofsimba.model;

public class BankAccount {
    public String name;
    public String balance;
    public String animalType;
    public boolean isKing;

    public BankAccount(String name, String balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
