public class Flower extends Plant {

    public Flower(String name, int nrOfPlants) {
        super.name = name;
    }

    public Flower() {
    }

    public void needsWater() {
        if (currentWaterAmount < 5) {
            System.out.println("The " + name + " flower needs water.");
        }
        System.out.println("The " + name + " flower doesn't need water.");
    }

    public void watering() {
        currentWaterAmount += waterAmount * 0.75;
    }

}