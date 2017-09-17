import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
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


        for (int i = 0; i < Math.ceil(rowCount / 2.); i++) {
            int spaceCount = (int)Math.ceil(rowCount / 2.) - (i + 1);
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rowCount / 2 - 1; i >= 0; i--) {
            int spaceCount = (int)Math.ceil(rowCount / 2.) - (i + 1);
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    public static void lines(int rows) {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}

//+3-i