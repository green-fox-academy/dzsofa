package Homework;

public class Mammal extends Animal{

    public Mammal(String name) {
        super.name = name;
    }

    @Override
    public void greet() {
        System.out.println("I'm a cute mammal");
    }

    @Override
    public String reproduce() {
        return "gives birth to baby mammal.";
    }

    @Override
    public void move() {
        System.out.println("I'm using my legs");
    }

    @Override
    public void eat() {
    }
}
