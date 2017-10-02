import java.util.ArrayList;
import java.util.Arrays;

public class GetIndex {

    public int getIndex(int value, ArrayList<Integer> list) {
        list = new ArrayList<>(Arrays.asList(1, 1, 2 , 3, 5, 8));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return -1;
    }
}
