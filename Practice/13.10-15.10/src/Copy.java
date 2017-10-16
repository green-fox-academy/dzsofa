import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        // This should be the basic replica of the 'cp' command
        // If ran from the command line without arguments
        // It should print out the usage:
        // copy [source] [destination]
        // When just one argument is provided print out
        // No destination provided
        // When both arguments provided and the source is a file
        // Read all contents from it and write it to the destination

        if (args.length == 0) {
            System.out.println("copy [source] [destination]");
        }
        if (args.length == 1) {
            System.out.println("No destination provided");
        }
        if (args.length == 2) {
            copyFile(args[0], args[1]);
        }
    }

    public static void copyFile(String source, String destination) {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);
        try {
            List<String> allLines = Files.readAllLines(sourcePath);
            for (String lines : allLines) {
                Files.copy(sourcePath, destPath);
            }
        } catch (IOException e) {
            System.out.println("Something is not right, try providing a valid file");
        }
    }
}