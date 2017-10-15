import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> countTitles = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            String author = books.get(i).author;
            if (countTitles.containsKey(author)) {
                int count = countTitles.get(author);
                countTitles.put(author, ++count);
            } else {
                countTitles.put(author, 1);
            }
        }
        Map.Entry<String, Integer> favAuthor = null;
        for (Map.Entry<String, Integer> bookEntry : countTitles.entrySet()) {
            if (favAuthor == null || bookEntry.getValue() > favAuthor.getValue()) {
                favAuthor = bookEntry;
            }
        }
        System.out.println("Your favorite author is: " + favAuthor.getKey());
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
            favorite();
        }
        return isThereAny;

    }
}
