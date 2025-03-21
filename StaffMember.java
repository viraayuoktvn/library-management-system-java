public class StaffMember extends Member {
    private String position;

    public StaffMember(int memberId, String name, String position) {
        super(memberId, name);
        this.position = position;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.borrowBook();
            borrowedBooks.add(book); // Track borrowed books
            System.out.println(name + " (Staff) borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + name + ". The book '" + book.getTitle() + "' is currently unavailable.");
        }
    }
}