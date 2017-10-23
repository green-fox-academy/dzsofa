package ParkingLot;

public class ParkingMain {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(256);
        parkingLot.addCars();

//        for (Car car : parkingLot.parkingLot) {
//            System.out.println(car);
//        }

        parkingLot.countAlike();


        System.out.println(parkingLot.toString());

        parkingLot.countTypes();

        parkingLot.countColors();


    }
}
