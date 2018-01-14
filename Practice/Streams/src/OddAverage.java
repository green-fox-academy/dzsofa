import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddAverage {

  public static void main(String[] args) {

    // Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream().filter(number -> number % 2 == 1 || number % 2 == -1).mapToDouble((number) -> number).average().ifPresent(avg -> System.out
        .println(avg));
//    System.out.println(numbers);

  }

}
