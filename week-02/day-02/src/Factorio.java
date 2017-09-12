public class Factorio {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String[] args) {
        System.out.println(factorio(4));

    }
    public static int factorio(int number) {
        int factorial = 1;                    /* has to be bigger than 0, because multiplication with 0 is 0 */
        for (int i = 1; i <= number; i++){    /* i has to be bigger than 0, see above*/
            factorial *= i;
        }
        return factorial;

    }


}

