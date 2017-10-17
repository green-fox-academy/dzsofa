package Homework.main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name) {
        super.name = name;
    }


    @Override
    public void greet() {
        System.out.println("Sieʃ oʃaske");
    }

    @Override
    public String reproduce() {
        return "lays tiny little eggsies.";
    }

    @Override
    public void move() {
        System.out.println("slowly moving");
    }
}
