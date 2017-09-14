import java.util.Scanner;

public class Calculator {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    public static void main(String[] args) {
        String operation;
        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please type in the operation (+, -, *, /): ");
        operation = sc.next();
        System.out.println("Please give me an integer: ");
        number1 = sc.nextInt();
        System.out.println("Please give me another integer:");
        number2 = sc.nextInt();

        calculator(operation, number1, number2);
    }
    public static void calculator(String operation, int operand1, int operand2) {
        if (operation.equals("+")) {
            int sum = 0;
            sum = operand1 + operand2;
            System.out.println("The sum of the two numbers is: " + sum);
        } else if (operation.equals("-")) {
            int minus = 0;
            minus = operand1 - operand2;
            System.out.println("The sum of the two numbers is: " + minus);
        }else if (operation.equals("*")) {
            int multiplication;
            multiplication = operand1 * operand2;
            System.out.println("The sum of the two numbers is: " + multiplication);
        } else if (operation.equals("/")) {
            int division = 1;
            division = operand1 / operand2;
            System.out.println("The sum of the two numbers is: " + division);
        } else {
            System.out.println("Something's not right");
        }
    }
}
