public class Animal {
    int hunger;
    int thirst;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
    }

    public void printStatus() {
        System.out.println("Hunger is: " + hunger + ", thirst is: " + thirst);
    }

    public static void main(String[] args) {
        Animal giraffe = new Animal();
        giraffe.printStatus();
        giraffe.play();
        giraffe.printStatus();
        giraffe.drink();
        giraffe.drink();
        giraffe.printStatus();
    }

}
