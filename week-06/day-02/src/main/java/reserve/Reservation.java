package main.java.reserve;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;

public class Reservation implements Reserving {
    private int codeLength = 8;
    static String[] AD = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public Reservation() {
    }

    @Override
    public String getDowBooking() {

        return null;
    }

    @Override
    public String getCodeBooking() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            sb.append()
        }
        return null;
    }
}
