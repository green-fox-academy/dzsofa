import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Function {

  public static void main(String[] args) {
    List<Palindrome> palindromes = new ArrayList<>(Arrays.asList(
        new Palindrome("dog"),
        new Palindrome("Markoka"),
        new Palindrome("indulagor"),
        new Palindrome("api"),
        new Palindrome("sor")
    ));

    palindromes.parallelStream()
        .map(Palindrome::buildPalindrome)
        .forEach(System.out::println);

    List<Palindrome> orderedBySecondChar =
        palindromes.parallelStream()
            .sorted(new Comparator<Palindrome>() {
              @Override
              public int compare(Palindrome o1, Palindrome o2) {
                return o1.getText().charAt(1) - o2.getText().charAt(1);
              }
            }).collect(Collectors.toList());

    System.out.println(orderedBySecondChar.toString());
  }

}
