public class Shifter implements CharSequence {
    String myWord;
    int shifting;

    public Shifter(String myWord, int shifting) {
        this.myWord = myWord;
        this.shifting = shifting;
    }

    @Override
    public int length() {
        return myWord.length();
    }

    @Override
    public char charAt(int index) {
        return myWord.charAt(index + shifting);
    }

    public String shift() {
        String result = myWord.substring(shifting);
        for (int i = 0; i < shifting; i++) {
            result += myWord.charAt(i);
        }
        return result;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Shifter shifter = new Shifter("maddog", 2);

        System.out.println(shifter.shift());
    }
}
