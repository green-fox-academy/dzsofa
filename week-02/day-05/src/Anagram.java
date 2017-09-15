import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in two words, I'll tell you whether they are anagrams or not!");

        System.out.print("First word: ");
        String firstword = sc.next();

        System.out.print("Second word: ");
        String secondword = sc.next();

        System.out.println(isAnagram(firstword, secondword));
    }
    public static boolean isAnagram(String firstword, String secondword) {
        char[] firstArray = firstword.toLowerCase().toCharArray();
        char[] secondArray = secondword.toLowerCase().toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        for (int i = 0; i < secondArray.length ; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
