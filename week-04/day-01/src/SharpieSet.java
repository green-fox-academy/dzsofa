import sun.security.provider.SHA;

import java.util.ArrayList;

public class SharpieSet {
    String name;
    ArrayList<Sharpie> sharpies;

    public SharpieSet(String name) {
        this.name = name;
        this.sharpies = new ArrayList<>();
    }

    public void addSharpies(Sharpie sh) {
        sharpies.add(sh);
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() <= 0) {
                sharpies.remove(sharpies.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Sharpie yellow = new Sharpie("yellow", 0.25f);
        Sharpie green = new Sharpie("green", 0.5f);
        Sharpie purple = new Sharpie("purple", 0.4f);
        Sharpie red = new Sharpie("red", 0.4f);


        SharpieSet sharpies = new SharpieSet("sharpies");
        sharpies.addSharpies(yellow);
        sharpies.addSharpies(green);
        sharpies.addSharpies(purple);
        sharpies.addSharpies(red);

        System.out.println(sharpies.countUsable());
        yellow.use();

        sharpies.removeTrash();

        System.out.println(sharpies.countUsable());

    }

}
