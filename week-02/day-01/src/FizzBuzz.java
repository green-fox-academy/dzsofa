public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        int initialNumber = 0;
        while (initialNumber < 100){
            System.out.println(initialNumber);
            initialNumber += 1;
            if (initialNumber % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (initialNumber % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (initialNumber % 3 == 0 && initialNumber % 5 == 0);
            {
                System.out.println("FizzBuzz");
            }
            /*else if ()
            System.out.println(i);*/
        }


    }
}
