import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        matchMaking(girls, boys, order);
        order = matchMaking(girls, boys);
        // Join the two lists by matching one girl with one boy in the order list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...
        System.out.println(order);
    }
    public static int min(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }
    public static int max(int number1, int number2) {
        if (number1 < number2) {
            return number2;
        } else {
            return number1;
        }
    }
    public static ArrayList<String> matchMaking(ArrayList<String> group1, ArrayList<String> group2) {
        ArrayList<String> order = new ArrayList<>();
        for (int i = 0; i < min(group1.size(), group2.size()); i++) {
            order.add(group1.get(i) + ", " + group2.get(i));
        }
        for (int i = min(group1.size(), group2.size()); i < max(group1.size(), group2.size()); i++) {
            if (group1.size() > group2.size()) {
                order.add(group1.get(i) + ", null");
            } else {
                order.add("null, " + group2.get(i));
            }
        }
        return order;
    }
    public static void matchMaking(ArrayList<String> group1, ArrayList<String> group2, ArrayList<String> order) {
        for (int i = 0; i < min(group1.size(), group2.size()); i++) {
            order.add(group1.get(i) + ", " + group2.get(i));
        }
        for (int i = min(group1.size(), group2.size()); i < max(group1.size(), group2.size()); i++) {
            if (group1.size() > group2.size()) {
                order.add(group1.get(i) + ", null");
            } else {
                order.add("null, " + group2.get(i));
            }
        }
    }
}
