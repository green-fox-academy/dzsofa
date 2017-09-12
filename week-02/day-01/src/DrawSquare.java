import java.util.Scanner;

public class DrawSquare {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number:");

        int rowCount = sc.nextInt();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                if (i == 0 || i == rowCount - 1 || j == 0 || j == rowCount - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}