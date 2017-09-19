import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path myPath = Paths.get("src/duplicated-chars.txt");
        try {
            List<String> textContent = Files.readAllLines(myPath);

            for (int i = 0; i < textContent.size(); i++) {
                for (int j = 0; j < textContent.get(i).length() - 1; j++) { // length - 1!!!!!
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
