import java.util.ArrayList;

public class ParkingLot {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car);

        ArrayList<Car> parkingLot = new ArrayList<>();
        ParkingLot.addCars(parkingLot);
        getCars(parkingLot);


    }

    public static void addCars(ArrayList<Car> cars) {
        for (int i = 0; i < 256; i++) {
            cars.add(new Car());
        }
    }

    public static void getCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
