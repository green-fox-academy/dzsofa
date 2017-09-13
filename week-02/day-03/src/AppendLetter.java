import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
    public static void main(String... args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.
        System.out.println((far));
    }
    public static void appendA(ArrayList<String> appending) {
        for (String i : appending) {
            i = i + "a";
//            appending.set(i + "a");
        }
//            far. = Integer.parseInt(far.indexOf(i) + "a");


        }

}
