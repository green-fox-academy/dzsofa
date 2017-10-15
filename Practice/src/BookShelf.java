import java.util.ArrayList;

public class BookShelf {
    ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void put(String author, String title, int releaseYear) {
        books.add(new Book(author, title, releaseYear));
    }

    public void remove(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) {
                books.remove(books.get(i));
            }
        }
    }

    public void earliest() {
        int min = 2000;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).releaseYear < min) {
                min = books.get(i).releaseYear;
            }
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).releaseYear == min) {
                System.out.println("Earliest book in your library is: " + books.get(i).toString());
            }
        }
    }

    public void latest() {
        int max = 1900;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).releaseYear > max) {
                max = books.get(i).releaseYear;
            }
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).releaseYear == max) {
                System.out.println("Latest book in your library is: " + books.get(i).toString());
            }
        }
    }

    public void favorite() {

    }

    @Override
    public String toString() {
        String isThereAny = "";
        if (this.books.size() == 0) {
            isThereAny = "You have no books here.";
            System.out.println(isThereAny);
        } else {
            isThereAny = "You have " + this.books.size() + " books.";
            System.out.println(isThereAny);
            earliest();
            latest();
        }
        return isThereAny;

    }
}
