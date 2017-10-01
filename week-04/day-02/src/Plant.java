public abstract class Plant {
    String name;
    float currentWaterAmount;
    float waterAmount;
    float absorption;

    public Plant(String name, float currentWaterAmount, float absorption) {
        this.name = name;
        this.currentWaterAmount = currentWaterAmount;
        this.waterAmount = waterAmount;
        this.absorption = absorption;
    }

    public Plant() {
        name = "noname";
        currentWaterAmount = 0;
    }

    public abstract boolean needsWater();

    public void watering(float waterAmount) {
        if (needsWater()) {
            currentWaterAmount += waterAmount * absorption;
        } else {

        }
    }

    public void printStatus() {
        if (needsWater()) {
            System.out.println( "The " + name + " needs water. The current water amount is " + currentWaterAmount );
        } else {
            System.out.println( "The " + name + " doesn't need water. The current water amount is " + currentWaterAmount );
        }
    }

}
