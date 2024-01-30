import java.util.ArrayList;

class Library2 extends Library{
    private ArrayList<Book> borrowList = new ArrayList<>();
    public void borrowBook(Book ... a){
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
}
public class Task2 {
    public static void main(String[] args) {
        Library2 palautuskirjasto = new Library2();
        Book b1 = new Book("Kirja1", "Kirjalija1", 1);
        Book b2 = new Book("Kirja2", "Kirjalija2", 2);
        palautuskirjasto.addBook(b1, b2);
        palautuskirjasto.displayBooks();
        palautuskirjasto.borrowBook(b1);
        palautuskirjasto.displayBooks();
        palautuskirjasto.returnBook(b1);
        palautuskirjasto.displayBooks();
    }
}
