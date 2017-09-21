public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(bunnEars(10));

    }

    public static int bunnEars(int bunNum) {
        if (bunNum == 1) {
            return 3;
        } else if (bunNum % 2 == 1) {
            return 3 + bunnEars(bunNum - 1);
        }
        return 2 + bunnEars(bunNum - 1);
    }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).