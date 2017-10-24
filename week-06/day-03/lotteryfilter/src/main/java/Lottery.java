import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionSet;
import joptsimple.OptionParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        argHandling(args);

    }

    public static void argHandling(String[] input) {
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();

        OptionSet options = parser.parse(input);
        String year = String.valueOf(options.valueOf("y"));
        String inputFile = String.valueOf(options.valueOf("f"));
        String outputFile = String.valueOf(options.valueOf("o"));

        if (options.has("y")) {
            try {
                if (options.has("f")) {
                    CSVReader reader = new CSVReader(new FileReader("../../src/main/java/" + inputFile));
                }
                CSVReader otosreader = new CSVReader(new FileReader("../../src/main/java/otos.csv"));
                CSVWriter writer = new CSVWriter(new FileWriter("../../src/main/java/output.csv"));
                List<String[]> otosLines = otosreader.readAll();
                List<String[]> temp = new ArrayList<>();

                for (int i = 0; i < otosLines.size(); i++) {
                    if (otosLines.get(i)[0].startsWith(year)) {
                        temp.add(otosLines.get(i));
                    }
                }
                if (options.has("o")) {
                    writer = new CSVWriter(new FileWriter("../../src/main/java/" + outputFile));
                    writer.writeAll(temp);
                    writer.close();
                }
                writer.writeAll(temp);
                writer.close();
            } catch (IOException e) {
                System.out.println("can't read the file, try another");
            }
        }
    }


}
