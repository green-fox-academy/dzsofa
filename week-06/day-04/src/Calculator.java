public class Calculator {
    public static void main(String[] args) {

        add(2, 10);
        subtract(5, 8);
        multiply(7, 9);
        divide(5, 0);
    }

    public static <T extends Number> void add(T first, T second) {
        int sum;
        sum = first.intValue() + second.intValue();
        System.out.println("Sum of " + first + " and " + second + " is: " + sum);
    }

    public static <T extends Number> void subtract(T first, T second) {
        int result;
        result = first.intValue() - second.intValue();
        System.out.println("Result of subtracting  " + second + " from " + first + " is: " + result);
    }

    public static <T extends Number> void multiply(T first, T second) {
        int result;
        result = first.intValue() + second.intValue();
        System.out.println("Multiplied value of " + first + " and " + second + " is: " + result);
    }

    public static <T extends Number> void divide(T first, T second) {
        int result;
        try {
            result = first.intValue() / second.intValue();
            System.out.println("Dividing " + first + " by " + second + " is: " + result);
        } catch (Exception ae) {
            System.out.println("Can't divide by zero");
        }
    }
}
