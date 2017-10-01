public class Aircraft {
    int maxAmmo;
    protected int initAmmo;
    protected int ammoStore;
    protected int baseDamage;
    int allDamage;
    String type;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public Aircraft() {
        this.initAmmo = 0;
    }

    public String fight(Aircraft another) {
        another.allDamage = another.baseDamage * this.ammoStore;
        this.ammoStore = 0;
        return "The damage suffered by " + another.getType() + " is " + another.allDamage + ".";
    }

    public String refill(int amount) {
        if (amount < maxAmmo - ammoStore) {
            ammoStore += amount;
            return "The total amount of ammo in your storage is: " + ammoStore;
        } else if (amount == maxAmmo - ammoStore) {
            ammoStore += amount;
            return "Your storage is full, nothing remains in filling station.";
        }
        else {
            ammoStore = maxAmmo;
            return "Your storage is full, " + (amount - maxAmmo) + " in filling station.";
        }
    }

    public String getType() {
        return type;
    }


    public String getStatus() {
        return "Type: " + type + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
    }
}
