import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();


        for (int i = 0; i < girls.size(); i++) {
           /* for (int j= 0; j < boys.size(); j++) */{
                if (i == i) {
                    order.add(girls.get(i) + ", " + boys.get(i));
                } else {
                    order.add(girls.get(i) + ", " + boys.get(i));
                }
            }
        }
        // Join the two lists by matching one girl with one boy in the order list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...
        System.out.println(order);
    }
}
