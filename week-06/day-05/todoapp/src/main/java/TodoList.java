import java.util.ArrayList;

public class TodoList {
    ArrayList<Todo> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String description) {
        this.todos.add(new Todo(description));
    }

    public Todo getTodo(int nr) {
        if (nr - 1 > todos.size() - 1 || nr - 1 == 0) {
            System.out.println("Todo with given id doesn't exist.\nLast entry:");
            return todos.get(todos.size() - 1);
        } else {
            return this.todos.get(nr - 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Todo todo : todos) {
            sb.append(todo + "\n");
        }
        return sb.toString();
    }
}
