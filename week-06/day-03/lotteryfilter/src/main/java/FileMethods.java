import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileMethods {

    public static void openFile(String file) {
        CSVReader reader;
        try {
            reader = new CSVReader(new FileReader(file));
            List<String[]> lines = reader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
