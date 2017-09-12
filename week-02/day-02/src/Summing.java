public class Summing {
    public static void main(String[] args) {
        System.out.println(Sum(9));
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter

    }
    public static int Sum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}
