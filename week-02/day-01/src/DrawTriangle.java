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
        Scanner triangleLine = new Scanner(System.in);

        System.out.println("Give me a number: ");

        int lineLength = triangleLine.nextInt();

        for (int i = 0; i < lineLength; i++)
            System.out.println("*" * lineLength);

    }
}
