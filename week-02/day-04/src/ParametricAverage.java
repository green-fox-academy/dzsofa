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

//        int[] myArray = new int[initializer];

        int sumAll = 0;
        int averageAll = 0;

        for (int i = 0; i < initializer; i++) {
            System.out.print("Give me another number: ");
            int myNumbers = sc.nextInt();
            sumAll += myNumbers;
            averageAll = sumAll / initializer;
        }
        System.out.println("Sum: " + sumAll + ", Average: " + averageAll);
    }
}
