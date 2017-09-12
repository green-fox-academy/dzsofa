public class DoubleItems {
    // - Create an array variable named `ag`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    public static void main(String[] args) {
        int[] ag = {3, 4, 5, 6, 7};
        int output = 0;
        for (int i = 0; i < ag.length; i++) {
            output = i * 2;
        }
        System.out.print(output);
//        System.out.println(doubling(ag));
    }

//    public static int doubling(int[] input) {
//        return input.length * 2;
//    }
}
