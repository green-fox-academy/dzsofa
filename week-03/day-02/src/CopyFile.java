import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {
        Path myPath = Paths.get("src/hello.txt");
        Path myPath2 = Paths.get("src/hello2.txt");
        System.out.println(isCopied("src/hello.txt", "src/hello2.txt"));

    }

    public static boolean isCopied(String file1, String file2) {
        Path myPath1 = Paths.get(file1);
        Path myPath2 = Paths.get(file2);
        try {
            Files.copy(myPath1, myPath2);
        } catch (IOException e) {
            return false;
        }
        return true;
    }


}
