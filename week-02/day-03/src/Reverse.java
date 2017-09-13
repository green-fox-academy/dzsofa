public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        System.out.println(reverse(reversed));
    }

    public static String reverse(String source) {
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }
}