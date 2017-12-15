import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>(Arrays.asList("asd", "asdasd", "thisisme", "asdossze"));

    strings = strings.stream()
        .filter(s -> s.startsWith("asd"))
        .collect(Collectors.toList());

    System.out.println(strings);
  }

}
