import java.util.ArrayList;
import java.util.Arrays;

public class PositiveSquare {

  public static void main(String[] args) {
//    Write a Stream Expression to get the squared value of the positive numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream().filter(myInt -> myInt > 0).mapToDouble(x -> Math.pow(x,2 )).forEach(System.out::println);
  }

}
