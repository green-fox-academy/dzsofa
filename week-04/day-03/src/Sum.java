import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> numbers;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public Sum(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public void addNumber(Integer nr) {
        numbers.add(nr);
    }

    public int sum() {
        int sumOfList = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumOfList += numbers.get(i);
        }
        return sumOfList;
    }
}
