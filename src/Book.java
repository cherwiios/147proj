/**
 * Represents a book in the library.
 */
public class Book extends LibraryItem {
    private String author;

    /**
     
     * @param title The title of the book.
     * @param author The author of the book.
     * @param bookId The unique identifier for the book.
     */
    public Book(String title, String author, int bookId) {
        super(title, bookId);
        this.author = author;
    }

    /**
     * Provides a string representation of the book details.
     * @return Formatted book details.
     */
    public String getBookDetails() {
        return String.format("Book ID: %d, Title: %s, Author: %s", itemId, title, author);
    }

    @Override
    public String display() {
        return "Book ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}
