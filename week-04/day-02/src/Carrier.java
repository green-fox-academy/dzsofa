import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> aircrafts;
    int ammoStore;
    int healthPoints;

    public Carrier(int ammoStore, int healthPoints) {
        this.aircrafts = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoints;
    }

    public void addAircraft(Aircraft ac) {
        if (ac.getType().equals("F16")) {
            aircrafts.add(ac);
        } else {
            aircrafts.add(0, ac);
        }
    }

    public String fight(Carrier anotherCarrier) {
        for (int i = 0; i < aircrafts.size(); i++) {
            anotherCarrier.healthPoints -= (this.aircrafts.get(i).acAmmoStore * anotherCarrier.aircrafts.get(i).baseDamage);
            aircrafts.get(i).acAmmoStore = 0;
        }
        return "The remaining hp is " + healthPoints + ".";
    }

    public String getStatus() {
        String stat = "";
        if (healthPoints == 0) {
            stat += "It's dead, Jim.";
        } else {
            stat = "HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStore + ", Total damage: " + getTotalDamage() + "\n" + "Aircrafts: \n";
            for (int i = 0; i < aircrafts.size(); i++) {
                stat += aircrafts.get(i).getStatus();
            }
        }
        return stat;
    }

    private int getTotalDamage() {
        int totalDamage = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            totalDamage += aircrafts.get(i).fight();
        }
        return totalDamage;
    }

    public void fill() {
        for (int i = 0; i < aircrafts.size(); i++) {
            ammoStore = aircrafts.get(i).refill(ammoStore);
        }
    }

    public static void main(String[] args) {
        Carrier one = new Carrier(20, 5000);
        one.addAircraft(new F35());
        one.addAircraft(new F16());
        one.addAircraft(new F35());
        one.addAircraft(new F16());
        one.fill();
        System.out.println(one.getStatus());


        Carrier two = new Carrier(200, 1000);
        two.addAircraft(new F35());
        two.addAircraft(new F16());
        two.addAircraft(new F16());
        two.addAircraft(new F35());
        two.fill();

        one.fight(two);
        System.out.println(one.getStatus());
        System.out.println(two.getStatus());
    }
}
