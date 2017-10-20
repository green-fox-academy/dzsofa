import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileManipulation {

    public static void printLines(String path, boolean printNr) {
        Path usagePath = Paths.get(path);
        try {
            List<String> allLines = Files.readAllLines(usagePath);
            int i = 1;
            for (String lines : allLines) {
                if (printNr) {
                    System.out.print(i + " - ");
                }
                System.out.print(lines);
                System.out.println();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void append(String path, String newTask) {
        try {
            Path taskPath = Paths.get(path);
            List<String> taskList = new ArrayList<>();
            taskList.add("[ ] " + newTask);
            Files.write(taskPath, taskList, StandardOpenOption.APPEND);
            System.out.println("Added to the list.");
        } catch (IOException e) {
            System.out.println("Unable to write file: " + path);
        }
    }

    public static void remove(String path, String arg) {
        System.out.println(arg);
        int removeNr = Integer.parseInt(arg);
        Path taskPath = Paths.get(path);
        try {
            List<String> allLines = Files.readAllLines(taskPath);
            if (removeNr <= allLines.size()) {
                allLines.remove(removeNr - 1);
                Files.write(taskPath, allLines);
                System.out.println("TODO removed");
            } else {
                System.out.println("Unable to remove: index is out of bound");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void check(String path, String arg) {
        System.out.println(arg);
        int chekNr = Integer.parseInt(arg);
        Path taskPath = Paths.get(path);
        try {
            List<String> allLines = Files.readAllLines(taskPath);
            if (chekNr <= allLines.size()) {
                if (allLines.get(chekNr - 1).charAt(1) == 'X') {
                    StringBuilder checkLine = new StringBuilder(allLines.get(chekNr - 1));
                    checkLine.setCharAt(1, ' ');
                    allLines.set(chekNr - 1, checkLine.toString());
                    System.out.println("TODO unchecked");
                } else {
                    StringBuilder checkLine = new StringBuilder(allLines.get(chekNr - 1));
                    checkLine.setCharAt(1, 'X');
                    allLines.set(chekNr - 1, checkLine.toString());
                    System.out.println("TODO completed");
                }
                Files.write(taskPath, allLines);
            } else {
                System.out.println("Unable to check: index is out of bound");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


