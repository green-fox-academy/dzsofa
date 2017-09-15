import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range minimum: ");
        int randommin = sc.nextInt();

        System.out.println("Enter the range maximum: ");
        int randommax = sc.nextInt();

        System.out.println("You chose a range between " + randommin + " and " + randommax);

        System.out.println("Guess the number: ");
        int myGuess = sc.nextInt();

        amIRight(myGuess,randomNumber(randommin, randommax));
    }

    public static void amIRight(int guess, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        while (guess < randomNumber || guess > randomNumber ) {
            if (guess < randomNumber) {
                System.out.println("Your guess is lower, than the number sought, guess again: ");
                guess = scanner.nextInt();
            }
            if (guess > randomNumber) {
                System.out.println("Your guess is bigger, than the number sought, guess again: ");
                guess = scanner.nextInt();
            }
            if (guess == randomNumber) {
                System.out.println("Yaay you found it!");
            }
        }
    }
    public static int randomNumber(int randmin, int randmax) {
        Random random = new Random();
        int result = random.nextInt((randmax - randmin) + 1) + randmin;
        return result;
    }
}