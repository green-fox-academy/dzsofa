import java.util.Arrays;

public class AppendA {
    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};

        for (int i = 0; i < nimals.length ; i++) {
            nimals[i] = nimals[i] + "a";
        }
        System.out.println(Arrays.toString(nimals));
    }
}
