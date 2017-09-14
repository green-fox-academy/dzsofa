import java.util.Scanner;

public class DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");

        int numberOfLines = scanner.nextInt();
        lines(numberOfLines);

//          first version, without a function
//        for (int i = 0; i < numberOfLines; i++) {
//            for (int j = 0; j < numberOfLines; j++) {
//                if (i == 0 || i == numberOfLines - 1 || j == 0 || j == numberOfLines - 1 || i == j) {
//                    System.out.print("%");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
//    function
    public static void lines(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                if (i == 0 || i == numberOfLines - 1 || j == 0 || j == numberOfLines - 1 || i == j) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
