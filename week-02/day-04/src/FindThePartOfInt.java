import java.util.ArrayList;

public class FindThePartOfInt {
    public static void main(String[] args) {

//        input: [1, 11, 34, 52, 61], 1
//        output: [0, 1, 4]

        int[] myNumbersList = {1, 11, 34, 52, 61, 12};
        int myNumber = 1;

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < myNumbersList.length; i++) {
            int temp = myNumbersList[i];
            while (temp >= myNumber) {
                if (temp == myNumber) {
                    indexes.add(i);
                    temp = 0;
                } else {
                    temp %= Math.pow(10, Math.floor(Math.log10(temp)));
                }
            }
        }
        System.out.println(indexes);
    }
}
