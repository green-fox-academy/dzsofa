class Station {
    int gasAmount = 1000;

    public void refill(Car car) {
        gasAmount -= car.capacity - car.gasAmount;
        car.gasAmount = car.capacity;
    }
}

class Car {
    int gasAmount;
    int capacity;

    public Car() {
        gasAmount = 0;
        capacity = 100;
    }

}

public class PetrolStation {
    public static void main(String[] args) {

        Station myStation = new Station();
        Car myCar = new Car();

        myStation.refill(myCar);
        System.out.println(myStation.gasAmount + ", " + myCar.gasAmount);
    }
}
