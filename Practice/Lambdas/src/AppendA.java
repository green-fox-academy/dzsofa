import java.util.Arrays;

public class AppendA {

  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};

    Arrays.stream(nimals).forEach(nimal -> System.out.println(new StringBuilder(nimal).append('a')));

  }

}
