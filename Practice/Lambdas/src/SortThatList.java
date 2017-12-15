import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortThatList {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(34, 22, 15, 83, 91, 7));

    numbers.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

    numbers.stream()
        .sorted(Integer::compareTo)
        .forEach(System.out::println);
  }
}
