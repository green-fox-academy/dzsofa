public class FindSubstring {

  public static void main(String[] args) {

    String string1 = "this is what I'm searching in";
    String string2 = "searching";

    boolean match = string1.contains(string2);
    if ((match)) {
      System.out.println(string2);
    } else {
      System.out.println(-1);
    }
    ;

  }
}
