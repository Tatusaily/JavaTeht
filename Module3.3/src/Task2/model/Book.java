package Task2.model;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // GETTERS
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }
}
