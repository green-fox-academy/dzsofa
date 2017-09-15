import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int rowCount = sc.nextInt();

        lines(rowCount);
    }
    public static void lines(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i / 2; k++) {
                System.out.print("* ");
            }
//            for (int j = rows - i / 2; j < rows; j++) {
//                System.out.print("* ");
//            }
//            for (int k = rows - i / 2; k <= i - 1; k++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }


}
