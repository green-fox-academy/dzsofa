public class Aircraft {
    int maxAmmo;
    int initAmmo;
    int ammoStore;
    int baseDamage;
    int allDamage;
    String type;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public Aircraft() {
        initAmmo = 0;
    }

    public int fight() {
        allDamage = baseDamage * ammoStore;
        ammoStore = 0;
        return allDamage;
    }

    public int refill(int amount) {
        if (amount < maxAmmo - ammoStore) {
            ammoStore += amount;
            return 0;
        } else {
            ammoStore = maxAmmo;
            return amount - maxAmmo;
        }
    }

    public String getType() {
        return type;
    }


    public String getStatus() {
        return "Type: " + type + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
    }
}
