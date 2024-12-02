public class Book {
    private String title;
    private String author;
    private int bookId;

    // Constructor
    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}




public class Member {
    private String name;
    private int memberId;
    private static int memberCounter = 0; // Static counter for unique member IDs

    // Constructor
    public Member(String name) {
        this.name = name;
        this.memberId = ++memberCounter; // Auto-increment member ID
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    // Display member details
    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
