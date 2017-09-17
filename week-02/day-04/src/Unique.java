import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 1);
        numbers.add(1, 11);
        numbers.add(2, 34);
        numbers.add(3, 11);
        numbers.add(4, 52);
        numbers.add(5, 61);
        numbers.add(6, 1);
        numbers.add(7, 34);
        numbers.add(8, 50);

        unique(numbers);
    }
    public static void unique(ArrayList<Integer> sortables) {
        for (int i = 0; i < sortables.size(); i++) {
            for (int j = 0; j < sortables.size(); j++) {
                if (sortables.get(i) == sortables.get(j) && i != j) {
                    sortables.remove(j);
                }
            }
        }
        System.out.println(sortables.toString());
    }


}
