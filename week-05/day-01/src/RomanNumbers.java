import java.util.ArrayList;
import java.util.Arrays;

public class RomanNumbers {

    public String convertToRoman(int arabic) {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1000, 900, 500, 400, 100, 50, 40, 10, 9, 5, 4));
        ArrayList<String> romanSymbols = new ArrayList<>(Arrays.asList("M", "CM", "D", "CD", "C", "L", "XL", "X", "IX", "V", "IV"));

        for (int i = 0; i < values.size(); i++) {
            arabic = convert(arabic, sb, values.get(i), romanSymbols.get(i));
        }

        for (int i = 0; i < arabic; i++) {
            sb.append("I");
        }
        return sb.toString();
    }

    private int convert(int arabic, StringBuilder sb, int value, String roman) {
        while (arabic >= value) {
            sb.append(roman);
            arabic -= value;
        }
        return arabic;
    }
}
