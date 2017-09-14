import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuoteSwap {
    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Also, print the sentence to the output with spaces in between.
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

//        String temp = list.get(2);
//        list.set(2, list.get(5));
//        list.set(5, temp);

        swap(2, 5, list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (String word : list) {
            System.out.print(word + " ");
        }
        System.out.println();

        printer(list);

    }
    public static void swap(int index1, int index2, ArrayList<String> myList) {
        String temp = myList.get(index1);
        myList.set(index1, myList.get(index2));
        myList.set(index2, temp);
    }

    public static void printer(ArrayList<String> myArray) {
        for (String word : myArray) {
            System.out.print(word + " ");
        }
    }
}
