public class Book {
    String author;
    String title;
    int releaseYear;

    public Book(String author, String title, int releaseYear) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return author + ": " + title + " (" + releaseYear + ")";
    }
}
