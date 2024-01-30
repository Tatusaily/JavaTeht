import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

class Book{
    private String title;
    private String author;
    private Integer year;
    private Double rating;
    private ArrayList<String> reviews;
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
    // Task4 -> Arvostelu ja pisteytys
    public void setRating(double rating){
        this.rating = rating;
    }
    public void addReview(String review){
        this.reviews.add(review);
    }
    public double getRating(){
        return rating;
    }
    public ArrayList<String> getReviews(){
        return reviews;
    }
}

class Library{
    private ArrayList<Book> booklist = new ArrayList<>();
    private ArrayList<User> userlist = new ArrayList<>();
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

    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    // Task2 -> Borrowing system
    private ArrayList<Book> borrowList = new ArrayList<>();
    public void borrowBook(User user, Book ... a){
        for(Book book : a){
            ArrayList<Book> blist = getBooklist();
            ArrayList<Book> rlist = getBorrowList();
            if(blist.contains(book)){
                rlist.add(book);
                blist.remove(book);
            }
        }
    }
    public void returnBook(Book ... a){
        for(Book book : a){
            ArrayList<Book> blist = getBooklist();
            ArrayList<Book> rlist = getBorrowList();
            if(rlist.contains(book)){
                blist.add(book);
                rlist.remove(book);
            }
        }
    }

    public ArrayList<Book> getBorrowList() {
        return borrowList;
    }
    // Task3 -> Library, jossa on saatavuustarkistus.
    public Boolean isBookAvailable(Book a){
        return getBooklist().contains(a);
    }
    // Task5 -> Statistiikka
    public double getAverageBookRating(){   // get average of all books
        double sum = 0;
        for(Book book : booklist){
            double rating = book.getRating();
            sum += rating;
        }
        sum /= booklist.size();
        return sum;
    }
    public Book getMostReviewedBook(){
        Book most = null;
        int sum = 0;
        for(Book book : booklist){
            int amount = book.getReviews().size();
            if (amount > sum) most = book;
        }
        return most;
    }
    public ArrayList<User> getUserList(){
        return this.userlist;
    }
}
class User {
    String name;
    int age;
    ArrayList<Book> borrowed = new ArrayList<>();
    public User(String name, int age, Library library){
        this.name = name;
        this.age = age;
        library.getUserList().add(this);
    }
}

public class LibraryTask {
    public static void main(String[] args) {
        Library lib = new Library();
        User user1 = new User("Tatu", 26, lib);
        Book b1 = new Book("Locomotive", "Brian Floca", 2013);
        Book b2 = new Book("The Food of Morocco", "Quentin Bacon", 2009);
        Book b3 = new Book("Last Lecture", "Jeffrey Zaslow", 2008);
        Book b4 = new Book("Cloud Cuckoo Land", "Anthony Doerr", 2010);
        Book b5 = new Book("Dear Santhuan", "Awkawae Emezi", 2011);
        Book b6 = new Book("1984", "George Orwell", 1954);
        lib.addBook(b1, b2, b3, b4, b5, b6); // pistetään kaikki yhdellä kertaa niin että hujahtaa
        lib.displayBooks();
        lib.getBookByAuthor("George Orwell", "Jeffrey Zaslow");
        System.out.println();

        // Task2, lainataan ja palautetaan
        lib.borrowBook(b6, b5, b4, b3);
        lib.displayBooks();
        lib.returnBook(b6);
        System.out.println();

        //Task3, tarkistetaan saatavuus
        System.out.println(lib.isBookAvailable(b5));
        System.out.println();

        //Task4, arvostelu

    }
}
