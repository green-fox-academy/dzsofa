public class Power {
    public static void main(String[] args) {

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
        System.out.println(powerN(4, 1));

    }

    public static int powerN(int base, int power) {
        if (base == 1 || power == 1) {
            return base;
        }
        return base * powerN(base, power - 1);
    }
}