import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileMethods {

    public static void readFile(String path) {

    }

    public static void countWord(String path) {
        Path myPath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(myPath);
            Map<String, Integer> counter = new HashMap<String, Integer>();
            for (int i = 0; i < lines.size(); i++) {
                String str = lines.get(i);
                if (counter.containsKey(str)) {
                    int count = counter.get(str);
                    counter.put(str, ++count);
                } else {
                    counter.put(str, 1);
                }
            }
            System.out.println(getMostFrequent(counter));
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static String getMostFrequent(Map<String, Integer> words) {
        Integer frequency = null;
        String mostFrequent = null;
        for (String s : words.keySet()) {
            Integer i = words.get(s);
            if (frequency == null)
                frequency = i;
            if (i > frequency) {
                frequency = i;
                mostFrequent = s;
            }
        }
        return mostFrequent;
    }
}
