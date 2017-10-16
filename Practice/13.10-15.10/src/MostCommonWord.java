import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        // This should be a simple word counter which give us the most common string in a file
        // If ran from the command line without arguments it should print out the usage:
        // java MostCommonWord [source]
        // When the argument provided and the source is a file
        // count all words in the given file and print the most common
        // ("cat", "CAT", "cat," "cat." are different words )

        if (args.length == 0) {
            System.out.println("java MostCommonWord [source]");
        } else {
            FileMethods.countWord(args[0]);
        }
    }

}
