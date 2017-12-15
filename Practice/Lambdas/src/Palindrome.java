public class Palindrome {

  SecondCharOperator<Palindrome> secondCharOperator = new SecondCharOperator<Palindrome>() {
    @Override
    public int compare(Palindrome first, Palindrome second) {
      return first.getText().charAt(1) - second.getText().charAt(1);
    }
  };

  private String text;

  public Palindrome(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String buildPalindrome() {
    return getText() + new StringBuilder(getText()).reverse();
  }

  @FunctionalInterface
  public interface SecondCharOperator<T> {

    int compare(T first, T second);

  }

  @Override
  public String toString() {
    return getText();
  }
}
