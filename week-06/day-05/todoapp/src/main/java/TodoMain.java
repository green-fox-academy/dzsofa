import java.util.ArrayList;

public class TodoMain {
    public static void main(String[] args) {

        TodoList myList = new TodoList();

        myList.add("dododo");
        myList.add("whatap");

        System.out.println(myList.todos);

        System.out.println(myList.getTodo(1));
        myList.getTodo(1).setComplete();
        System.out.println(myList.todos);
    }
}
