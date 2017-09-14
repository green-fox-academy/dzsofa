import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two numbers:");

        int number1 = sc.nextInt();
        System.out.println(number1);

        int number2 = sc.nextInt();
        System.out.println(number2);

        printBigger(number1, number2);
    }
    public static void printBigger(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " is the bigger number.");
        } else if (number2 > number1) {
            System.out.println(number2 + " is the bigger number.");
        } else {
            System.out.println("Neither one is bigger.");
        }
    }
}
