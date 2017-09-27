import java.util.HashMap;
import java.util.Map;

public class CountLetter {
    public static void main(String[] args) {
        String str = "Reference";
        Map<Character, Integer> charCount = new HashMap<>();

        System.out.println(countLetter(str));
    }

    public static String countLetter(String string) {
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < string.toLowerCase().length(); i++) {
            char charAt = string.charAt(i);
            if (!dictionary.containsKey(charAt)) {
                dictionary.put(charAt, 1);
            } else {
                dictionary.put(charAt, dictionary.get(charAt) + 1);
            }
        }
        return dictionary.toString();
    }
}


