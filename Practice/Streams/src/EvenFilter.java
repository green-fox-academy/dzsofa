import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenFilter {

  // Write a Stream Expression to get the even numbers from the following array:
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
  }
}
