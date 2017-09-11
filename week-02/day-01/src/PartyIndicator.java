import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
        Scanner scanner = new Scanner(System.in);

        //nr of girls
        System.out.println("How many girls are coming?");

        int numberOfGirls = scanner.nextInt();

        //nr of boys
        System.out.println("How many boys are coming?");

        int numberOfBoys = scanner.nextInt();

        //printing all the things

// It should print: The party is excellent!
// If the the number of girls and boys are equal and there are more people coming than 20
        if (numberOfGirls == numberOfBoys && numberOfGirls + numberOfBoys > 20 && numberOfGirls > 0) {
            System.out.println("The party is excellent!");
        }

// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
        else if (numberOfGirls != numberOfBoys && numberOfGirls + numberOfBoys > 20 && numberOfGirls > 0) {
            System.out.println("Quite cool party!");
        }

//
// It should print: Average party...
// If there are less people coming than 20
        else if (numberOfGirls + numberOfBoys < 20 && numberOfGirls > 0) {
            System.out.println("Average party...");
        }
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
        else {
            System.out.println("Sausage party");
        }


    }
}
