import sun.security.provider.SHA;

import java.util.Scanner;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public Sharpie() {
        this.inkAmount = 100;
    }

    public float use() {
        return inkAmount - (float)0.5;
    }

    public static void main(String[] args) {
        Sharpie green = new Sharpie("green", 1.5f);
        System.out.println(green.use());
    }
}
