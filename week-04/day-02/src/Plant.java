public class Plant {
    String name;
    float currentWaterAmount;
    float waterAmount;
    float absorption;

    public Plant(String name, float currentWaterAmount) {
        this.name = name;
        this.currentWaterAmount = currentWaterAmount;
        this.waterAmount = waterAmount;
    }

    public Plant() {
        name = "noname";
        currentWaterAmount = 0;
    }

    public boolean needsWater() {
        if (true) {
            return true;
        } else {
            return false;
        }
    }

    public void watering() {
        currentWaterAmount += waterAmount * absorption;
    }


}
