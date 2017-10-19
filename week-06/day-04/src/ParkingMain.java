public class ParkingMain {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(256);

        parkingLot.addCars();
        System.out.println(parkingLot.toString());
        parkingLot.countTypes();
        parkingLot.countColors();
        parkingLot.countSame();
    }
}
