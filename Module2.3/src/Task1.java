import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

class Book{
    private String title;
    private String author;
    private Integer year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}

class Library{
    private ArrayList<Book> booklist = new ArrayList<>();
    public void addBook(Book ... a){
        for(Book book : a){
            booklist.add(book);
        }
    }
    public void displayBooks(){
        for (Book book : booklist){
            System.out.printf("%s, %s. (%s) \n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
    public void getBookByAuthor(String ... author){
        for (String auth : author){
            for (Book book : booklist){
                if (Objects.equals(book.getAuthor(), auth))
                    System.out.printf("%s, %s. (%s) \n", book.getTitle(), book.getAuthor(), book.getYear());
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
            Library lib = new Library();
            Book b1 = new Book("Locomotive", "Brian Floca", 2013);
            Book b2 = new Book("The Food of Morocco", "Quentin Bacon", 2009);
            Book b3 = new Book("Last Lecture", "Jeffrey Zaslow", 2008);
            Book b4 = new Book("Cloud Cuckoo Land", "Anthony Doerr", 2010);
            Book b5 = new Book("Dear Santhuan", "Awkawae Emezi", 2011);
            Book b6 = new Book("1984", "George Orwell", 1954);
            lib.addBook(b1, b2, b3, b4, b5, b6); // pistetään kaikki yhdellä kertaa niin että hujahtaa
            lib.displayBooks();
            lib.getBookByAuthor("George Orwell", "Jeffrey Zaslow");
    }
}
