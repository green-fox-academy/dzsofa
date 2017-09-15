import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int initNumber = sc.nextInt();

        ArrayList<Integer> initDigits = new ArrayList<Integer>();
        newList(initNumber, initDigits);
        armstrongArray(initDigits);


        isArmstrong(armstrongArray(initDigits));
    }


    public static void isArmstrong(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] + Math.pow(digits[i], digits.length);
        }
        System.out.println(sum);
    }
    public static ArrayList<Integer> newList(int myNumber, ArrayList<Integer> myList) {
        int i = 0;
        while (myNumber > 0) {
            myList.add(myNumber % 10);
            myNumber = myNumber / 10;
            i++;
        }
        return myList;
    }
    public static int[] armstrongArray(ArrayList<Integer> myList) {
        int[] armstrongDigits = new int[myList.size()];
        for (int j = 0; j < myList.size(); j++) {
            armstrongDigits[j] = myList.get(j).intValue();
        }
        return armstrongDigits;
    }
}
