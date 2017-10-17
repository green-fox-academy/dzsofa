package Homework.main.java.animals;

public class Bird extends Animal{

    public Bird (String name) {
        super.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Quack");
    }

    @Override
    public String reproduce() {
        return "lays cute eggs.";
    }

    @Override
    public void move() {
        System.out.println("uses wings");
    }
}
