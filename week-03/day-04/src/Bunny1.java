public class Bunny1 {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(bunnEars(5));
    }

    public static int bunnEars(int bunNum) {
        if (bunNum == 1) {
            return 2;
        }
        return EARS + bunnEars(bunNum - 1);
    }

    static int EARS = 2;
}