import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    ArrayList<Car> parkingLot;

    public ParkingLot() {
        parkingLot = new ArrayList<>();
    }

    private void add() {
        this.parkingLot.add(new Car());
    }

    public void addCars() {
        for (int i = 0; i < 256; i++) {
            this.parkingLot.add(new Car());
        }
    }

    public void getCars() {
        for (Car car : this.parkingLot) {
            System.out.println(car);
        }
    }

    //counts occurrence of car types
    public void countTypes() {
        Map<String, Integer> typeCount = new HashMap<>();
        for (int i = 0; i < this.parkingLot.size(); i++) {
            String carType = this.parkingLot.get(i).getType();
            if (typeCount.containsKey(carType)) {
                int count = typeCount.get(carType);
                typeCount.put(carType, ++count);
            } else {
                typeCount.put(carType, 1);
            }
        }
        for (Map.Entry entry : typeCount.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();
    }

    //counts occurrence of colors
    public void countColors() {
        Map<String, Integer> colorCount = new HashMap<>();
        for (int i = 0; i < this.parkingLot.size(); i++) {
            String carColor = this.parkingLot.get(i).getColor();
            if (colorCount.containsKey(carColor)) {
                int count = colorCount.get(carColor);
                colorCount.put(carColor, ++count);
            } else  {
                colorCount.put(carColor, 1);
            }
        }
        for (Map.Entry entry : colorCount.entrySet()) {
            System.out.println(entry + " ");
        }
        System.out.println();
    }

}
