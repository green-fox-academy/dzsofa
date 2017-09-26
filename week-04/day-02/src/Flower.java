public class Flower extends Plant {

    public Flower(String name, float currentWaterAmount) {
        super.name = name;
        super.currentWaterAmount = currentWaterAmount;
    }

    public Flower() {
        absorption = 0.75f;
    }

    public void needsWater() {
        if (currentWaterAmount < 5) {
            System.out.println("The " + name + " flower needs water. The current water amount is " + currentWaterAmount);
        } else {
            System.out.println("The " + name + " flower doesn't need water. The current water amount is " + currentWaterAmount);
        }
    }

    public void watering(float waterAmount) {
        currentWaterAmount += waterAmount * absorption;
    }

}