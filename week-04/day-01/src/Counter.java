public class Counter {
    int number;

    public Counter (int number) {
        this.number = number;
    }

    public Counter () {
        number = 0;
    }
    public int add(int number2) {
        return number + number2;
    }

    public int add() {
        return number++;
    }

    public int get() {
        return number;
    }
}
