import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        //creating scanner
        Scanner scanner = new Scanner(System.in);
        // Modify this program to greet user instead of the World!

        //ask for input NAME
        System.out.println("What is your name?");

        //wait for user input
        String userName = scanner.nextLine();

        //print new line with user input
        System.out.println("Hello " + userName + "!");
    }
}
