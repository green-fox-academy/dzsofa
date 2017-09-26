
import com.sun.java.browser.plugin2.DOM;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class Domino {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }


}

class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        //oldversion
        List<Domino> dominoesNew = new ArrayList<>();
        dominoesNew.add(dominoes.get(0));

        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 1; j < dominoes.size(); j++) {
                int[] domin1 = dominoesNew.get(i).getValues();
                int[] domin2 = dominoes.get(j).getValues();
                if (domin1[1] == domin2[0]) {
                    dominoesNew.add(dominoes.get(j));
                }
            }
        }
        System.out.println(dominoesNew);


        //azeversion without new list
        for (int i = 0; i < dominoes.size() - 1; i++) {
            for (int j = i + 1; j < dominoes.size(); j++) {
                if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0] && j != i+1) {
                    Domino temp = dominoes.get(i+1);
                    dominoes.set(i+1, dominoes.get(j));
                    dominoes.set(j, temp);
                }
            }
        }
        System.out.println(dominoes);
    }


    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}