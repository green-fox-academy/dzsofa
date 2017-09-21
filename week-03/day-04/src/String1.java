public class String1 {
    public static void main(String[] args) {
        System.out.println(xys("xyxesdsxfdxj"));

    }

    public static String xys(String changeX) {
        if (changeX.length() == 0) {
            return "";
        }
        String pre = changeX.startsWith("x") ? "y" : changeX.substring(0, 1);
        return pre + xys(changeX.substring(1));
    }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.