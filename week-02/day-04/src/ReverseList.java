import java.util.Arrays;

public class ReverseList {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};

        swapper(aj);
    }
    public static void swapper(int[] myArray) {
        for (int i = 0; i < myArray.length / 2 ; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
