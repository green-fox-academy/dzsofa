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

    public int timeToComplete() {
        return getCompletedDate().getDayOfYear() - getCreatedDate().getDayOfYear();
    }

    @Override
    public String toString() {
        if (completedDate == null) {
            return getId() + " " + description + ", created on: " + getCreatedDate().toString() + " not finished yet";
        }
        else {
            return getId() + " " + description + ", created on: " + getCreatedDate().toString() + ", finished on: " + getCompletedDate().toString() + ". It took you " + timeToComplete() + " days to complete the task.";
        }
    }
}
