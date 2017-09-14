import java.util.Scanner;

public class DrawChessTable {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number, I'll draw you a chess table!");

        int chessNumber = sc.nextInt();
        chess(chessNumber);


    }
    public static void chess(int sizeOfTable) {
        for (int i = 0; i < sizeOfTable; i++) {
            for (int j = 0; j < sizeOfTable; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
            }
            System.out.println();
        }
    }
}
