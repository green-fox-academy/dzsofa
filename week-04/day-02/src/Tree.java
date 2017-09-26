public class Tree extends Plant {

    public Tree(String name, float currentWaterAmount) {
        super.name = name;
        super.currentWaterAmount = currentWaterAmount;
    }

    public Tree() {
        absorption = 0.4f;
    }

    public void needsWater() {
        if (currentWaterAmount < 10) {
            System.out.println("The " + name + " tree needs water. The current water amount is " + currentWaterAmount);
        } else {
            System.out.println("The " + name + " tree doesn't need water. The current water amount is " + currentWaterAmount);
        }
    }

    public void watering(float waterAmount) {
        currentWaterAmount += waterAmount * absorption;
    }
}
