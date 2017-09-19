import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        try {
            Path myPath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(myPath);
            System.out.println(Arrays.asList(lines));
        } catch (IOException e) {
            System.out.println("Could not read the file");
        }

    }
}
