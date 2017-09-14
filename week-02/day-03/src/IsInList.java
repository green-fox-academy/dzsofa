import java.util.ArrayList;
import java.util.Arrays;


public class IsInList {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int[] myNumbers = {4, 8, 12, 16};
        int[] myNumbers2 = {4, 8, 12, 26};
        if (containsAll(myNumbers, list)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (container(myNumbers, myNumbers2, list)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

    }
    public static boolean contains(int myNumber, ArrayList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myNumber == myList.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAll(int[] myNumbers, ArrayList<Integer> myList) {
        for (int i = 0; i < myNumbers.length; i++) {
            if (!contains(myNumbers[i], myList)) {
                return false;
            }
        }
        return true;
    }

    public static boolean container(int[] numbers, int[] numbers2, ArrayList<Integer> list) {
        if (containsAll(numbers, list) && containsAll(numbers2, list)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean containsMatrix(int[][] myNumbers, ArrayList<Integer> list) {
        for (int i = 0; i < myNumbers.length; i++) {
            if (!containsAll(myNumbers[i], list)) {
                return false;
            }
        }
        return true;
    }
    public static boolean containsMatrix3d(int[][][] myNumbers, ArrayList<Integer> list) {
        for (int i = 0; i < myNumbers.length; i++) {
            if (!containsMatrix(myNumbers[i], list)) {
                return false;
            }
        }
        return true;
    }
}
