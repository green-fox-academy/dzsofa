import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1;
        String string2;

        string1 = "HeLLo";
        string2 = "hEllO";

        System.out.println(isAnagram(string1, string2));
    }

    public static boolean isAnagram(String string1, String string2) {
        char[] firstArray = string1.toLowerCase().toCharArray();
        char[] secondArray = string2.toLowerCase().toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        for (int i = 0; i < secondArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}


