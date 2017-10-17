import main.java.reserve.*;

public class ReservationApp {
    public static void main(String[] args) {
        Book book = new Book();

        book.addReservation("18:00", 5);
        book.addReservation("12:00", 2);
        book.addReservation("20:00", 1);
        book.addReservation("17:30", 6);
        System.out.println(book.toString());

//        System.out.println(reservation.getCodeBooking());
//        System.out.println(reservation.getDowBooking());
//        System.out.println(reservation.toString());

    }

}
