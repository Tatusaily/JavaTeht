package Task3;

import Task3.model.*;
import Task3.system.*;

public class Main {
    public static void main(String[] args) {
        Library lib1 = new Library();
        LibraryMember u1 = new LibraryMember("Matti"), u2 = new LibraryMember("Juhani");
        lib1.addMembers(u1, u2);    // We add members.
        Book b1 = new Book("BTitle1", "BAuthor1", "951-34423-6-1"),
                b2 = new Book("BTitle2", "Bauthor2", "952-35163-7-2");
        // Run some demonstration commands.
        // Intentionally try to return a book that the user doesn't have.
        lib1.addBook(b1, b2);       lib1.borrowBook(u1, b2);
        lib1.borrowBook(u2, b1);    lib1.returnBook(u1, b2);
        lib1.returnBook(u2, b2);    lib1.returnBook(u2, b1);

    }
}
