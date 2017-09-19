import java.util.Scanner;

public class DivideByZero {
    // create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // it should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number, I will divide 10 with it: ");
        int divisor = sc.nextInt();
        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("FAIL, loser");
        }

    }

}