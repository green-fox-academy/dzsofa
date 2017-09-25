public class Counter {
    private int number;
    private int initial;

    public Counter(int number) {
        this.number = number;
        this.initial = number;
    }

    public Counter() {
        number = 0;
        initial = 0;
    }

    public void add(int number2) {
        number += number2;
    }

    public void add() {
        number++;
    }

    public int get() {
        return number;
    }

    public void reset() {
        number = initial;
    }
}
