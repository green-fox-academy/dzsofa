public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo
        StringBuilder header = new StringBuilder();
        header.append("My todo:\n");
        String todoTextNew = todoText.concat(" - Download games\n" + " \t- Diablo");

        String todoTextNewer = header + todoTextNew;

        System.out.println(todoTextNewer);
    }
}
