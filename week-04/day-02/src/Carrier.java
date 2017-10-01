import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> aircrafts;
    int ammoStore;
    int healthPoints;

    public Carrier(int ammoStore, int healthPoints) {
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoints;
    }

    public Carrier() {
        this.aircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft ac) {
        aircrafts.add(ac);
    }


    public String fight(Carrier anotherCarrier) {
        for (int i = 0; i < aircrafts.size(); i++) {
            anotherCarrier.healthPoints -= (this.aircrafts.get(i).ammoStore * anotherCarrier.aircrafts.get(i).baseDamage);
            aircrafts.get(i).ammoStore = 0;
        }
        return "The remaining hp is " + healthPoints + ".";
    }


    public static void main(String[] args) {
        Carrier one = new Carrier();
        one.addAircraft(new F16());
        one.addAircraft(new F16());
        one.addAircraft(new F16());
        one.addAircraft(new F16());


        Carrier two = new Carrier();
        two.addAircraft(new F16());
        two.addAircraft(new F16());
        two.addAircraft(new F16());
        two.addAircraft(new F16());
    }
}
