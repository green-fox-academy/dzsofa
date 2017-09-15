import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are there? ");
        int initNumber = sc.nextInt();

        josephus(initNumber, 1);


    }
    public static int josephus(int initial, int steps) {
            steps = 1;
            int winningSeat = 0;
        for (int i = initial; i > 0; i--) {
            winningSeat = ((initial - 1) + steps - 1) % initial + 1;
        }   if (initial == 1) {
                return 1;
        }
                return winningSeat;
    }
}
