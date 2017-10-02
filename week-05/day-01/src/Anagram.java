import java.util.Arrays;

public class Anagram {

    public boolean checkAnagram(String word1, String word2) {
        char[] char1 = word1.toLowerCase().toCharArray();
        char[] char2 = word2.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        for (int i = 0; i < char2.length; i++) {
            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }
}
