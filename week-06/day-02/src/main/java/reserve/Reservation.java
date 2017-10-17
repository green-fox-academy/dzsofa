package main.java.reserve;

import java.util.Random;

public class Reservation implements Reserving {
    private int codeLength = 8;
    static String[] ALPHABET = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random random = new Random();
    String time;
    int nrOfPpl;


    public Reservation(String time, int nrOfPpl) {
        this.time = time;
        this.nrOfPpl = nrOfPpl;
        getCodeBooking();
        getDowBooking();
    }

    @Override
    public String getDowBooking() {
        return DOW[random.nextInt(DOW.length)].toString();
    }

    @Override
    public String getCodeBooking() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            sb.append(ALPHABET[random.nextInt(ALPHABET.length)]);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        if (this.nrOfPpl < 2) {
            return this.getCodeBooking() + " for " + this.getDowBooking() + ", at " + this.time + ". Table for " + this.nrOfPpl + ". Give customer a free drink to cheer up!";
        }
        return this.getCodeBooking() + " for " + this.getDowBooking() + ", at " + this.time + ". Table for " + this.nrOfPpl + ".";
    }
}
