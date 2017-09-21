public class String2 {
    public static void main(String[] args) {
        System.out.println(removeX("xyesxxdsxfdj"));
    }

    public static String removeX(String withX) {
        if (withX.length() == 0) {
            return "";
        }
        String pre = withX.startsWith("x") ? "" : withX.substring(0, 1);
        return pre + removeX(withX.substring(1));
    }
}
// Given a string, compute recursively a new string where all the 'x' chars have been removed.