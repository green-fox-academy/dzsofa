public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        System.out.println(count(100));

    }

    public static int count(int input) {
        int result = 0;
        for (int i = input; i > 0; i--) {
            System.out.println(input);
            return count(input - 1);
        }
        return input;
    }

}


