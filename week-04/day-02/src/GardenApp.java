import java.util.ArrayList;

public class GardenApp {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();

        Plant yellow = new Flower("yellow", 4);
        plants.add(yellow);
        Plant blue = new Flower("blue", 4);
        plants.add(blue);
        Plant orange = new Tree("orange", 5);
        plants.add(orange);
        Plant purple = new Tree("purple", 5);
        plants.add(purple);


        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).needsWater();
        }



        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).watering();
        }
    }
}
