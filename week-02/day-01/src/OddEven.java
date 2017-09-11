import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number and I will tell you if it's even or odd");

        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0)
            System.out.println("Yay, it's an even number!");
        else
            System.out.println("You seem kinda odd to me.");
    }
}
