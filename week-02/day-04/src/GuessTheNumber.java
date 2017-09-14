import java.util.Scanner;

public class GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    public static void main(String[] args) {
        int myNumber = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");

        int guess = sc.nextInt();
        guess(guess, myNumber);
    }
    public static void guess(int number, int myNumber) {
        if (number == myNumber) {
            System.out.println("You found the number: 8.");
        } else if (number > myNumber){
            System.out.println("The stored number is lower.");
        } else {
            System.out.println("The stored number is higher.");
        }
    }
}
