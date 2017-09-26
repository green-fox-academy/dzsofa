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

    public void needsWater() {
    }

    public void watering(float waterAmount) {
        currentWaterAmount += waterAmount * absorption;
    }


}
