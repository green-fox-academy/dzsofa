import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeCollection {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> treeMap = new ArrayList<Map<String, Object>>();


        Map<String, Object> tree0 = new HashMap<String, Object>();
        tree0.put("type", "Ginkgo biloba");
        tree0.put("leaf color", "green");
        tree0.put("age", 10);
        tree0.put("sex", "male");

        Map<String, Object> tree1 = new HashMap<String, Object>();
        tree1.put("type", "Willow");
        tree1.put("leaf color", "green");
        tree1.put("age", 17);
        tree1.put("sex", "female");

        Map<String, Object> tree2 = new HashMap<String, Object>();
        tree2.put("type", "Katsura tree");
        tree2.put("leaf color", "green");
        tree2.put("age", 24);
        tree2.put("sex", "male");

        Map<String, Object> tree3 = new HashMap<String, Object>();
        tree3.put("type", "Amur cork tree");
        tree3.put("leaf color", "yellowish green");
        tree3.put("age", 5);
        tree3.put("sex", "female");

        Map<String, Object> tree4 = new HashMap<String, Object>();
        tree4.put("type", "Yew");
        tree4.put("leaf color", "green");
        tree4.put("age", 31);
        tree4.put("sex", "female");
    }
}
