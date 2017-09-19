import java.util.ArrayList;
import java.util.Arrays;

public class FindSubstringInList {
    public static void main(String[] args) {
//        input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
//        output: 4
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        String myWord = "sear";

        System.out.println(isInList(myWord, myArrayList));
    }

    public static int isInList(String subString, ArrayList<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.get(i).length(); j++) {
                boolean found = myList.get(i).length() - j >= subString.length();
                for (int k = 0; k < subString.length() && found; k++) {
                    if (myList.get(i).charAt(j + k) != subString.charAt(k)) {
                        found = false;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }
}