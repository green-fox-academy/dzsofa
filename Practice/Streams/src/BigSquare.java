import java.util.ArrayList;
import java.util.Arrays;

public class BigSquare {

  public static void main(String[] args) {
//    Write a Stream Expression to find which number squared value is more then 20 from the following array://

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers.stream().filter(num -> Math.pow(num,2 ) > 20).mapToDouble(num -> Math.pow(num,2 )).forEach(System.out::println);

  }

}
