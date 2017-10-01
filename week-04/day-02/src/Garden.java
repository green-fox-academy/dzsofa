import java.util.ArrayList;


public class Garden {
    ArrayList<Plant> plants;


    public Garden() {
        this.plants = new ArrayList<>();

    }

    public int countThirsty() {
        int count = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                count++;
            }
        }
        return count;
    }

    public void waterThirsty(float totalAmount) {
        int thirsty = countThirsty();
        System.out.println("Watering with: " + totalAmount);
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                plants.get( i ).watering( totalAmount / thirsty);
            }
        }
    }

    public void printStatus() {
        for (int i = 0; i < plants.size(); i++) {
            plants.get( i ).printStatus();
        }
        System.out.println();
    }

}



