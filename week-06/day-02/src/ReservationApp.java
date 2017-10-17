import main.java.reserve.*;

public class ReservationApp {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();

        System.out.println(reservation.getCodeBooking());
        System.out.println(reservation.getDowBooking());
        System.out.println(reservation.toString());
    }

}
