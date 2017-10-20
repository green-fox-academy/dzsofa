import java.time.LocalDate;

public class Todo {
    private int id;
    String description;
    private LocalDate createdDate;
    LocalDate completedDate;

    private static int nrOfTodos = 0;

    public Todo(String description) {
        this.description = description;
        createdDate = LocalDate.now();
        completedDate = null;

        id = ++nrOfTodos;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    @Override
    public String toString() {
        return getId() + " " + description + " " + getCreatedDate().toString() + " " + getCreatedDate().toString();
    }
}
