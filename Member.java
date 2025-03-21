import java.util.ArrayList;
import java.util.List;

public class Member implements Borrowable {
    protected int memberId;
    protected String name;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.borrowBook();
            borrowedBooks.add(book); // Track borrowed books
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + name + ". The book '" + book.getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) { // Check if the book was actually borrowed
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle() + ".");
        }
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }
}