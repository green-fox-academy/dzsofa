import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        encode("src/encoded-lines.txt");

    }

    public static void encode(String myFile) {
        Path myPath = Paths.get(myFile);
        try {
            List<String> textContent = Files.readAllLines(myPath);

            for (int i = 0; i < textContent.size(); i++) {
                for (int j = 0; j < textContent.get(i).length(); j++) {
                    char myText;
                    if (Integer.valueOf(textContent.get(i).charAt(j)) == 32) {
                        myText = (char) (Integer.valueOf(textContent.get(i).charAt(j)) + 0);
                    } else {
                        myText = (char) (Integer.valueOf(textContent.get(i).charAt(j)) - 1);
                    }
                    System.out.print(myText);
                }

                System.out.println(); // not to be forgotten, or everything will be on one line
            }
        } catch (IOException e) {
            System.out.println("Houston, we have a problem");
        }
    }

}

