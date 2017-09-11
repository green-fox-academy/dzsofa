import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        //asking for the first number
        System.out.println("Give me a number:");

        int firstNumber = scanner.nextInt();

        //asking for the second number
        System.out.println("Give me another number:");

        int secondNumber = scanner.nextInt();

        if (secondNumber <= firstNumber)
            System.out.println("The second number should be bigger!");
        else
            for (int i = firstNumber; i < secondNumber; i++) {
                System.out.println(i);
            }
    }
}
