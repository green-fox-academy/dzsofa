public class Flower extends Plant {

    public Flower(String name, float currentWaterAmount) {
        super.name = name;
        super.currentWaterAmount = currentWaterAmount;
        super.absorption = 0.75f;
    }

    public boolean needsWater() {
        if (currentWaterAmount < 5) {
            return true;
        } else {
            return false;
        }
    }


    public void watering() {
    }

}