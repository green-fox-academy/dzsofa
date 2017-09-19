import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {
        System.out.println(lineCount("src/reversed-lines.txt"));

    }

    public static int lineCount(String myFile) {
        Path myPath = Paths.get(myFile);
        List<String> lines;
        int lineNumber;
        try {
            lines = Files.readAllLines(myPath);
            lineNumber = lines.size();
        } catch (IOException e) {
            return 0;
        }
        return lineNumber;
    }
}
