public class SplitString {
    public static void main(String[] args) {

        String[] myArray = splitString("lovebarbara", 12);

        for (String s : myArray) {
            if (s == myArray[0]) {
                System.out.print(s + ", ");
            } else {
                System.out.print(s);
            }
        }
    }

    private static String[] splitString(String input, int index) {
        String[] output = new String[2];
        try {
            output[0] = input.substring(0, index);
            output[1] = input.substring(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds, try another number");
        }
        return output;
    }
}
