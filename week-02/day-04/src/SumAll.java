public class SumAll {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};

        // method 1 with foreach
        int sum = 0;
        for (int i : ai) {
            sum += i;
        }
        System.out.println(sum);

        //method2 with fori
        int sum2 = 0;
        for (int i = 0; i < ai.length; i++) {
            sum2 += ai[i];
        }
        System.out.println(sum);
    }
}
