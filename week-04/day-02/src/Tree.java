public class Tree extends Plant {

    public Tree(String name, float currentWaterAmount) {
        super.name = name;
        super.currentWaterAmount = currentWaterAmount;
    }

    public Tree() {
        super.absorption = 0.4f;
    }

    public boolean needsWater() {
        if (currentWaterAmount < 10) {
            System.out.println("The " + name + " tree needs water. The current water amount is " + currentWaterAmount);
            return true;
        } else {
            System.out.println("The " + name + " tree doesn't need water. The current water amount is " + currentWaterAmount);
            return false;
        }
    }

    public void watering() {
    }
}
