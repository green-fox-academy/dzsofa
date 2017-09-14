import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!
        if (arrayList.contains(7)) {
            System.out.println("Hooooray!");
        } else {
            System.out.println("Noooo");
        }
        if (contains(7, arrayList)) {
            System.out.println("Hooooray!");
        } else {
            System.out.println("Noooo");
        }
    }
    public static boolean contains(int myNumber, ArrayList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myNumber == myList.get(i)) {
                return true;
            }
        }
        return false;
    }
}

