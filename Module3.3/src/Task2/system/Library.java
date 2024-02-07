package Task2.system;
import Task2.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private final ArrayList<Book> booklist;
    private final ArrayList<Book> borrowlist;
    private final ArrayList<LibraryMember> memberlist;
    public Library(){
        this.booklist = new ArrayList<>();
        this.borrowlist = new ArrayList<>();
        this.memberlist = new ArrayList<>();
    }

    // GETTERS
    public ArrayList<Book> getBooklist() {
        return booklist;
    }
    public ArrayList<Book> getBorrowlist() {
        return borrowlist;
    }
    public ArrayList<LibraryMember> getMemberlist() {
        return memberlist;
    }

    // FUNCTIONALITY
    public void addBook(Book ... a){    // Add all books.
        this.booklist.addAll(Arrays.asList(a));
    }
    public void addMembers(LibraryMember ... a){    // Add all members
        memberlist.addAll(Arrays.asList(a));
    }
    // Member can have unlimited copies of a book
    public void borrowBook(LibraryMember member, Book book){
        if (booklist.contains(book)){
            booklist.remove(book);
            borrowlist.add(book);
            member.getBookList().add(book);
        }else {
            System.out.println("Book not found");
        }
    }
    // Validate member and booklist
    public void returnBook(LibraryMember member, Book book){
        if (borrowlist.contains(book) && member.getBookList().contains(book)){
            borrowlist.remove(book);
            member.getBookList().remove(book);
            booklist.add(book);
        }
    }
}
