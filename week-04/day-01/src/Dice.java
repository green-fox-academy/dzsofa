
import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
    int[] dices = new int[6];


    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public void print() {
        for (int i = 0; i < dices.length; i++) {
            System.out.print(getCurrent()[i]);
            if (i != dices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public boolean isSix() {
        for (int i = 0; i < dices.length; i++) {
            if (dices[i] != 6) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.roll();

        myDice.print();
        System.out.println(myDice.isSix());
        while (!myDice.isSix()) {
            myDice.reroll();
        }
        myDice.print();
    }

}
