public class SumDigit {
    public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        System.out.println(sumDigit(5498));

    }
    public static int sumDigit(int inputNumber) {
        if (inputNumber % 10 == inputNumber || inputNumber < 0) {
            return inputNumber;
        }
        return (inputNumber % 10) + sumDigit(inputNumber / 10);
    }

}