public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        System.out.println(adder(100));
    }
    public static int adder(int inputNumber) {
        for (int i = 1; i <= inputNumber; i++) {
            //System.out.println(inputNumber); // to check numbers
            return (adder(inputNumber - 1) + inputNumber);
        }
        return inputNumber;
    }
}

