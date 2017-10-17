import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    String myWord;

    public Gnirts(String myWord) {
        this.myWord = myWord;
    }

    @Override
    public int length() {
        return myWord.length();
    }

    @Override
    public char charAt(int index) {
        return myWord.charAt(myWord.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return myWord.subSequence((myWord.length() - 1 - end), (myWord.length() - 1 - start));
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }

    public static void main(String[] args) {

        Gnirts string = new Gnirts("yggod");

        System.out.println(string.length());
        System.out.println(string.charAt(2));
        System.out.println(string.subSequence(1, 4));
    }
}
