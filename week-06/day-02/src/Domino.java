import com.sun.java.browser.plugin2.DOM;

import java.util.*;

public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int getValueA() {
        return values[0];
    }

    public int getValueB() {
        return values[1];
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino domino) {
        return Comparator.comparingInt(Domino::getValueA)
                .thenComparingInt(Domino::getValueB)
                .compare(this, domino);
    }

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(7, 3));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        // Java version
        Collections.sort(dominoes);
        System.out.println(dominoes.toString());

    }

}