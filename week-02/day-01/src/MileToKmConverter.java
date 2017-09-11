import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        //ask the user for input
        System.out.println("Write distance in miles, I will calculate it in km-s: ");

        double distanceInMiles = scanner.nextDouble();

        System.out.println(distanceInMiles * 1.6093 + " km is what you were looking for.");
    }
}
