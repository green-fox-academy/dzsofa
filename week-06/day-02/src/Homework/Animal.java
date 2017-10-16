package Homework;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String color;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public abstract void greet();

    public abstract String reproduce();

    public abstract void move();

    public void eat() {
        System.out.println("omnomnomnom");
    }
}
