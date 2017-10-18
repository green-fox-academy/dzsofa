import joptsimple.*;
import com.opencsv.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("y");
        parser.accepts("f");
        parser.accepts("o");
        OptionSet options = parser.parse(args);

        if (options.has("y")) {
            FileMethods.openFile("src/assets/otos.csv");
        } if (options.has("f")) {

        }
        if (options.has("o")) {

        }
    }


}
