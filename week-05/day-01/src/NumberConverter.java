import java.util.ArrayList;
import java.util.Arrays;

public class NumberConverter {

    public String convert(int value) {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<String> valuesInString = new ArrayList<>(Arrays.asList("nineteen", "eighteen", "seventeen", "sixteen", "fifteen", "fourteen", "thirteen", "twelve", "eleven", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"));

        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == value) {
                sb.append(valuesInString.get(i) + " ");
            }
        }
        return sb.toString();
    }
}
