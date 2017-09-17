import java.lang.reflect.Array;
import java.util.ArrayList;

public class SortThatList {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[0] = 1;
        numbers[1] = 11;
        numbers[2] = 41;
        numbers[3] = 17;
        numbers[4] = 45;
        numbers[5] = 78;
        numbers[6] = 2;
        numbers[7] = 4;

        int[] sortedList = sorting(numbers, false);

        for (int i = 0; i < sortedList.length; i++) {
            System.out.println(sortedList[i]);
        }
    }

    public static int[] sorting(int[] inputNumbers, boolean ascend) {
        for (Integer i = 0; i < inputNumbers.length; i++) {
            for (Integer j = 0; j < inputNumbers.length; j++) {
                if (ascend = false) {
                    if (inputNumbers[i] > inputNumbers[j]) {
                        Integer temp = inputNumbers[j];
                        inputNumbers[j] = inputNumbers[i];
                        inputNumbers[i] = temp;
                    }
                } else {
                    if (inputNumbers[i] < inputNumbers[j]) {
                        Integer temp = inputNumbers[j];
                        inputNumbers[j] = inputNumbers[i];
                        inputNumbers[i] = temp;
                    }
                }
            }

        }
        return inputNumbers;
    }

}
