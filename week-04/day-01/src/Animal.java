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

    public int eat() {
        return hunger - 1;
    }

    public int drink() {
        return thirst - 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
        System.out.println(hunger + ", " + thirst);
    }

    public static void main(String[] args) {
        Animal giraffe = new Animal();
        giraffe.play();
        System.out.println(giraffe.drink());
    }

}
