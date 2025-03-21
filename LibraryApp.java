public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book book1 = new Book(1, "Java Programming", "John Doe", 9);
        Book book2 = new Book(2, "Data Structures", "Jane Smith", 11);
        library.addBook(book1);
        library.addBook(book2);

        // Register members
        Member member1 = new Member(101, "Andini");
        StaffMember staff1 = new StaffMember(201, "Vira", "Librarian");
        library.registerMember(member1);
        library.registerMember(staff1);

        // Display books
        library.displayAvailableBooks();

        // Member borrows a book
        member1.borrowBook(book2);
        staff1.borrowBook(book1);

        // Display books after borrowing
        library.displayAvailableBooks();

        // Return books
        member1.returnBook(book2);
        staff1.returnBook(book2);

        // Display books after returning
        library.displayAvailableBooks();
    }
}