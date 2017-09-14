import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int initializer = sc.nextInt();

//        int[] calculate = new int[initializer];

        for (int i = 0; i < initializer; i++) {
            Scanner nextNr = new Scanner(System.in);
            System.out.print("Give me another number: ");
            int myNumbers = nextNr.nextInt();
            int [] calculate = {myNumbers};

        }

    }
}
