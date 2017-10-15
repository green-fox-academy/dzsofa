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
        }
        return isThereAny;

    }
}
