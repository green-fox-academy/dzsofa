import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word, I'll create a palindrome for you: ");
        String myWord = sc.next();
        createPalindrome(myWord);
    }
    public static void createPalindrome(String wordInput) {
        String output = "";
        for (int j = wordInput.length() - 1; j >= 0; j--) {
            output = output + wordInput.charAt(j);
        }
        System.out.println(wordInput + output);
    }
}
