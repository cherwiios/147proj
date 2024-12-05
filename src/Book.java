// Class definition for Book
public class Book {
    // Private fields for the book's title, author, and unique ID
    private String title;
    private String author;
    private int bookId;

    // Constructor to initialize a Book object with title, author, and book ID
    public Book(String title, String author, int bookId) {
        this.title = title; // Assigns the title passed to the constructor
        this.author = author; // Assigns the author passed to the constructor
        this.bookId = bookId; // Assigns the book ID passed to the constructor
    }

    // Overrides the toString method to provide a string representation of the book
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}
