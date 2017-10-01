public class Tree extends Plant {

    public Tree(String name, float currentWaterAmount) {
        super.name = name;
        super.currentWaterAmount = currentWaterAmount;
        super.absorption = 0.4f;
    }

    public Tree() {
    }

    public boolean needsWater() {
        if (currentWaterAmount < 10) {
            return true;
        } else {
            return false;
        }
    }

    public void watering() {
    }
}
