import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> numbers;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public Sum() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int nr) {
        numbers.add(nr);
    }

    public void removeNumber(int nr) {
        numbers.remove(nr);
    }

    public int sum() {
        try {
            int sumOfList = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sumOfList += numbers.get(i);
            }
            return sumOfList;

        } catch (NullPointerException ex) {
            return 0;
        }
    }
}
