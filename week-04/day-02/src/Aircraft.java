public class Aircraft {
    int maxAmmo;
    protected int initAmmo;
    protected int acAmmoStore;
    protected int baseDamage;
    String type;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public Aircraft() {
        this.initAmmo = 0;
    }

    public int fight() {
        return acAmmoStore * baseDamage;
    }

    public int refill(int amount) {
        if (amount <= maxAmmo - acAmmoStore) {
            acAmmoStore += amount;
            return 0;
        } else {
            int fill = maxAmmo - acAmmoStore;
            acAmmoStore = maxAmmo;
            return amount - fill;
        }
    }

    public String getType() {
        return type;
    }


    public String getStatus() {
        return "Type: " + type + ", Ammo: " + acAmmoStore + ", Base Damage: " + baseDamage + ", All Damage: " + fight() + "\n";
    }
}
