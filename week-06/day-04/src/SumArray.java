import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

        sumArray(intArray, 5);
        sumArray(doubleArray, 6);
    }

    public static <T extends Number> void sumArray(T[] myArray, Integer length) {
        Double sum = 0.0;
        try {
            for (int j = 0; j < length; j++) {
                    sum += myArray[j].doubleValue();
                }
            System.out.println("Sum of your list for the first " + length + " elements is: " + sum);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Your number is too large, try giving a lower one.");
        } finally {
            System.out.println("Elements of your list are: " + Arrays.toString(myArray) + "\n");
        }
    }
}
