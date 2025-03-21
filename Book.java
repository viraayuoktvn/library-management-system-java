public class Book {
    private int bookId;
    public String title;
    public String author;
    public int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public boolean borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        availableCopies++;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (Available: " + availableCopies + ")";
    }
}