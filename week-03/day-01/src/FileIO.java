import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
        Path myPath = Paths.get("./reversed-lines.txt"); // to reach my file
        List<String> lines = null;
        try {
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            System.out.println("Valami szar van..");
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
