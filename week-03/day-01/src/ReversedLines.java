import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverse("src/reversed-lines.txt");
    }

    public static void reverse(String myFile) {
        Path myPath = Paths.get(myFile);
        try {
            List<String> textContent = Files.readAllLines(myPath);

            for (int i = 0; i < textContent.size(); i++) {
                for (int j = textContent.get(i).length() - 1; j > 0; j--) { // length - 1!!!!!
                    if (textContent.get(i).charAt(j) == textContent.get(i).charAt(j + 1)) {
                        System.out.print(textContent.get(i).charAt(j));
                    }
                }
                System.out.println(); // not to be forgotten, or everything will be on one line
            }
        } catch (IOException e) {
            System.out.println("Houston, we have a problem");
        }

    }
}

