import java.util.ArrayList;
import java.util.Arrays;

public class OddAvg {
    public static void main(String[] args) {
        // Create a function called `oddAverage` that takes a list of numbers as parameter
        // and returns the average value of the odd numbers in the list
        // Create basic unit tests for it with at least 3 different test cases

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6));
        System.out.println(oddAverage(numbers));
    }

    public static int oddAverage(ArrayList<Integer> numbers) {
        int average = 0;
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() != 0) {
                if (numbers.get(i) % 2 == 1) {
                    average += numbers.get(i);
                    counter++;
                }
            } if (counter == 0){
                return 0;
            }
        }
        return average / counter;
    }
}

