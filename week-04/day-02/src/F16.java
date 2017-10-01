public class F16 extends Aircraft{

    public F16() {
        super.type = "F16";
        super.maxAmmo = 8;
        super.baseDamage = 30;

    }

    public static void main(String[] args) {
        F16 f16 = new F16();
        System.out.println(f16.getType());
        System.out.println(f16.getStatus());
        System.out.println(f16.refill(8));
        System.out.println(f16.getStatus());

        F16 f16another = new F16();

        System.out.println(f16.fight(f16another));
        System.out.println(f16.getStatus());
    }


}
