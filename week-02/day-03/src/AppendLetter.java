import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
    public static void main(String... args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.
        appendA(far);
        System.out.println(far);
    }
    public static void appendA(ArrayList<String> appending) {
        for (int i = 0; i < appending.size(); i++) {
            appending.set(i, appending.get(i) + "a");

        }
    }

}