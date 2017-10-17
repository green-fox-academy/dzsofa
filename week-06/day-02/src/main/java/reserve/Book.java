package main.java.reserve;

import java.util.ArrayList;

public class Book {
    ArrayList<Reservation> bookingList;

    public Book() {
        bookingList = new ArrayList<Reservation>();
    }

    public void addReservation(String time, int nrOfPpl) {
        bookingList.add(new Reservation(time, nrOfPpl));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bookingList.size(); i++) {
            sb.append("Booking#" + (i + 1) + " ");
            sb.append(bookingList.get(i));
            sb.append("\n");
        }
        sb.append("Upcoming reservations are: \n");
        return sb.toString();
    }
}
