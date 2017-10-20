import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Todo {
    private int id;
    String description;
    protected LocalDate createdDate;
    private LocalDate completedDate;

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

    public void setComplete() {
        completedDate = LocalDate.now();
    }

    @Override
    public String toString() {
        if (completedDate == null) {
            return getId() + " " + description + " " + getCreatedDate().toString() + " " + getCompletedDate();
        }
        else {
            return getId() + " " + description + " " + getCreatedDate().toString() + " " + getCompletedDate().toString();
        }
    }
}
