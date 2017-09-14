import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfInput {

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me five numbers:");

        int number1 = sc.nextInt();
        System.out.println(number1);

        int number2 = sc.nextInt();
        System.out.println(number2);

        int number3 = sc.nextInt();
        System.out.println(number3);

        int number4 = sc.nextInt();
        System.out.println(number4);

        int number5 = sc.nextInt();
        System.out.println(number5);

        int[] myNumbers = {number1, number2, number3, number4, number5};
        System.out.println("Sum: " + summing(myNumbers) + ", Average: " + average(summing(myNumbers), myNumbers));
    }
    public static int summing(int[] myNumbers) {
        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum = sum + myNumbers[i];
        }
        return sum;
    }
    public static double average(int sum, int myArray[]) {
        double average = sum / myArray.length;
        return average;
    }

}
