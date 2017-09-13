import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuoteSwap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
//        Collections.swap(list, 2, 5);
        // Also, print the sentence to the output with spaces in between.
        for (int i = 0; i < list.size(); i++) {
            list.set(2, list.get(5));


        } System.out.println(list);
    }
}
