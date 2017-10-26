//import java.util.Comparator;
//
//public class Thing implements Comparable<Thing>{
//    private String name;
//    private boolean completed;
//
//    public Thing(String name) {
//        this.name = name;
//    }
//
//    public void complete() {
//        this.completed = true;
//    }
//    public String getName() {
//        return this.name;
//    }
//
//    @Override
//    public String toString() {
//        return (completed ? "[x] " : "[ ] ") + name;
//    }
//
//    @Override
//    public int compareTo(Thing thing) {
//        return Comparator.comparing(Thing::completed)
//    }
//}
