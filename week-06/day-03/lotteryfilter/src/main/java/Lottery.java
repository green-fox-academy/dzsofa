import joptsimple.OptionSet;
import joptsimple.OptionParser;

public class Lottery {

    public static void main(String[] args) {

        OptionParser parser = new OptionParser("yfo:");
        String year = null;

        OptionSet options = parser.parse("-y", year);

        if (options.has("y")) {
            FileMethods.openFile("src/main/assets/otos.csv");
        } if (options.has("f")) {

        }
        if (options.has("o")) {

        }

        FileMethods.openFile("src/main/assets/otos.csv");
    }


}
