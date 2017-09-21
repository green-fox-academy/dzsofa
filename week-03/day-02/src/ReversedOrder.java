import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverse("src/reversed-order.txt");

    }

    public static void reverse(String myFile) {
        Path myPath = Paths.get(myFile);
        try {
            List<String> textContent = Files.readAllLines(myPath);

            for (int i = textContent.size() - 1; i >= 0; i--) {// length - 1!!!!!
                System.out.print(textContent.get(i));
                System.out.println(); // not to be forgotten, or everything will be on one line
            }
        } catch (IOException e) {
            System.out.println("Houston, we have a problem");
        }

    }
}
