public class String3 {
    public static void main(String[] args) {
        System.out.println(asterisk("xyesxxdsxfdj"));
    }
    public static String asterisk(String giveMeAsterisk) {
        if (giveMeAsterisk.length() == 0) {
            return "";
        }
        String pre = giveMeAsterisk.matches("^[A-I].*$") ? "*" : giveMeAsterisk.substring(0, 1);
        return asterisk(giveMeAsterisk.substring(1)) + "*";
    }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".