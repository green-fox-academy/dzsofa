import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));

    numbers.stream()
        .distinct()
        .forEach(System.out::println);
  }

}
