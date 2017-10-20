import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        if (args.length != 0) {
            if (args[0].equals("-l")) {
                FileManipulation.printLines("./Assets/tasks.txt", true);
            } else if (args[0].equals("-a")) {
                FileManipulation.append("./Assets/tasks.txt", args[1]);
            } else if (args[0].equals("-r")) {
                FileManipulation.remove("./Assets/tasks.txt", args[1]);
            } else if (args[0].equals("-c")) {
                FileManipulation.check("./Assets/tasks.txt", args[1]);
            } else if (args[0].equals("-al")) {
                FileManipulation.append("./Assets/tasks.txt", args[1]);
                FileManipulation.printLines("./Assets/tasks.txt", true);
            } else if (args[0].equals("-cl")) {
                FileManipulation.check("./Assets/tasks.txt", args[1]);
                FileManipulation.printLines("./Assets/tasks.txt", true);
            } else if (args[0].equals("-rl")) {
                FileManipulation.remove("./Assets/tasks.txt", args[1]);
                FileManipulation.printLines("./Assets/tasks.txt", true);
            } else {
                System.out.println("Unsupported argument\n");
            }
        } else {
            FileManipulation.printLines("./Assets/printusage.txt", false);
        }


    }
}
