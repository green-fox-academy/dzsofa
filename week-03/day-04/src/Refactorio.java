public class Refactorio {
    public static void main(String[] args) {

        System.out.println(refactorio(5));

    }

    public static int refactorio(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return refactorio(number - 1) * number;
    }
}
// - Create a recursive function called `refactorio`
//   that returns it's input's factorial
