import java.lang.reflect.Array;
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
        System.out.println("Give me a number: ");
        int initializer = sc.nextInt();
        calculator(initializer);

    }
    public static void calculator(int initializer) {
        for (int i = 0; i < initializer; i++) {
            Scanner numScanner = new Scanner(System.in);
            System.out.println("Give me one more number:");
            initializer = numScanner.nextInt();
        } int[] myNumbers = {initializer};
        System.out.println(myNumbers);
    }
}
