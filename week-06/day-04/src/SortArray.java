import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

        System.out.println("Array integerArray contains:");
        sortArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        sortArray(doubleArray);   // pass a Double array

    }

    public static <T extends Number> void sortArray(T[] myArray) {
        try {
            Arrays.sort(myArray, Collections.reverseOrder());
        } catch (Exception x) {
            System.out.println("Not valid type");
        } finally {
            System.out.println(Arrays.toString(myArray));
        }
    }
}
