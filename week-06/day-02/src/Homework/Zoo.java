package Homework;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("Who wants a baby?");
        System.out.println(reptile.getName() + ", " + reptile.reproduce());
        System.out.println(mammal.getName() + ", " + mammal.reproduce());
        System.out.println(bird.getName() + ", " + bird.reproduce());
    }

}
