import java.util.ArrayList;

public class TodoList {
    ArrayList<Todo> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String description) {
        this.todos.add(new Todo(description));
    }

    public Todo getTodo(int index) {
        return this.todos.get(index - 1);
    }

}
