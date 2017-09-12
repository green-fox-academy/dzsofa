import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        Scanner intScanner = new Scanner(System.in);

        System.out.println("Give me a number: ");

        int rowCount = intScanner.nextInt();

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
