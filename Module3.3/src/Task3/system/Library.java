package Task3.system;
import Task3.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Library {
    private final ArrayList<Book> booklist;
    private final ArrayList<LibraryMember> memberlist;
    public Library(){
        this.booklist = new ArrayList<>();
        this.memberlist = new ArrayList<>();
    }

    // GETTERS
    public ArrayList<Book> getBooklist() {
        return booklist;
    }
    public ArrayList<LibraryMember> getMemberlist() {
        return memberlist;
    }

    // FUNCTIONALITY
    public void addBook(Book ... a){    // Add all books.
        for (Book book : a){
            booklist.add(book);
            System.out.println("Added book " + book.getTitle() + ".");
        }
    }
    public void addMembers(LibraryMember... a){    // Add all members
        for (LibraryMember member : a){
            memberlist.add(member);
            System.out.println("Added member " + member.getName() + ".");
        }
    }
    // Member can have unlimited copies of a book
    public void borrowBook(LibraryMember member, Book book){
        if (booklist.contains(book)&& !book.isReserved()){
            booklist.remove(book);
            member.reserveBook(book);
            book.toggleReserved();
            System.out.println(member.getName() + " borrowed book " + book.getTitle() + ".");
        }else {
            System.out.println("Book not found or is already reserved");
        }
    }
    // Validate member and booklist
    public void returnBook(LibraryMember member, Book book){
        if (book.isReserved() && member.getBookList().contains(book)){
            book.toggleReserved();
            member.getBookList().remove(book);
            booklist.add(book);
            System.out.println(member.getName() + " returned book " + book.getTitle() + ".");
        }else {
            System.out.println("Something went wrong when returning book.");
        }
    }
    public void displayBorrowedBooks(LibraryMember member){
        System.out.println(member.getName() + "'s borrowed books:");
        for (Book book : member.getBookList()){
            System.out.println(book.getTitle());
        }
    }
}
