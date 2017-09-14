import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number: ");

        int lineCount = sc.nextInt();
        lines(lineCount);

    }
    public static void lines(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfLines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}