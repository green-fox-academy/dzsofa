import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);

        //ask for number of chicken
        System.out.println("How many chicken do you have?");

        // wait for answer
        int chicken = scanner.nextInt();

        //ask for number of pigs
        System.out.println("How many pigs do you have?");

        //wait for anwer
        int pigs = scanner.nextInt();

        System.out.println(/* "Total legs of your animals is: " + */(chicken * 2) + (pigs * 4));

    }

}