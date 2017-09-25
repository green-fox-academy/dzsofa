import java.awt.*;

public class PostIt {
    String backGroundColor;
    String text;
    String textColor;

    public PostIt() {

    }

    public PostIt(String backGroundColor, String text, String textColor) {
        this.backGroundColor = backGroundColor;
        this.text = text;
        this.textColor = textColor;
    }

}

class ExamplePostIT {
    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("Orange", "Idea 1", "Blue");
        System.out.println(postIt1.backGroundColor + " " + postIt1.text + " " + postIt1.textColor);

        PostIt postIt2 = new PostIt("Pink", "Awesome", "Black");
        System.out.println(postIt2.backGroundColor + " " + postIt2.text + " " + postIt2.textColor);

        PostIt postIt3 = new  PostIt();
        postIt3.backGroundColor = "Yellow";
        postIt3.text = "Superb!";
        postIt3.textColor = "Green";
        System.out.println(postIt3.backGroundColor + " " + postIt3.text + " " + postIt3.textColor);
    }
}
