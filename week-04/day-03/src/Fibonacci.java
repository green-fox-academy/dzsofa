public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(7));

    }

    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        } else {
            number = fibonacci(number - 1) + fibonacci(number - 2);
        }
        return number;
    }
}
