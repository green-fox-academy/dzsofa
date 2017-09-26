import java.util.ArrayList;


public class Garden {
    ArrayList<Plant> plants;



    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void watering(float waterAmount, float absorption) {
        for (int i = 0; i < plants.size(); i++) {
        if (plants.get(i).needsWater() == true) {
            plants.get(i).currentWaterAmount += waterAmount / plants.size() * absorption;
            
        }
        }
    }


}



