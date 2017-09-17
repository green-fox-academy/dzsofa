public class FindSubstring {
    public static void main(String[] args) {
        String string1 = "this is what I'm searching in";
        String string2 = "searchking";

        System.out.println(isSubstring(string1, string2));
    }
    public static int isSubstring(String searchable, String substring) {
        for (int i = 0; i < searchable.length(); i++) {
            boolean found = searchable.length() - i >= substring.length();
            for (int j = 0; j < substring.length() && found; j++) {
                if (searchable.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}
