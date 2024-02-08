package Task3.model;

import java.util.ArrayList;

public class LibraryMember {
    private final String name;
    private final int ID;
    static int IDcounter = 0;
    private final ArrayList<Book> bookList;

    public LibraryMember(String name){
        IDcounter++;
        this.ID = IDcounter;
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
