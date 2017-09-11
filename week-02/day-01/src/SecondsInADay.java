public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        //seconds in a minute = 60, second in an hour = 3600
        currentSeconds = ((currentHours * 3600) + (currentMinutes * 60) + currentSeconds);
        //seconds in a day = 86400
        int dayInSeconds = 86400;
        int remainingSeconds = dayInSeconds - currentSeconds;

        System.out.println("There are " + remainingSeconds + " seconds remaining of today.");
    }
}
