import sun.security.provider.SHA;

import java.util.Scanner;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 5;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public Sharpie() {
        this.inkAmount = 5;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    public void use() {
        inkAmount = inkAmount - (float) 5;
    }


    public static void main(String[] args) {
        Sharpie green = new Sharpie("green", 1.5f);
        green.use();
    }
}
