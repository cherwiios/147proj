import java.util.Scanner;
public class libMgmtProj {
  public static void main(Strings[] args){
    
  }
}


import java.util.Date;

public class Book {
    private String title;
    private String author;
    private int bookId;
    private static int bookCounter = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookId = (int)(Math.random() * 10000); // Use Math.random() to assign a random book ID
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}



public class Member {
    private String name; // Encapsulation
    private int memberId;
    private static int memberCounter = 0; // Static variable to track the total number of members

    // Constructor
    public Member(String name) {
        this.name = name;
        this.memberId = ++memberCounter;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Display member information
    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}





import java.util.Scanner;

public class LibrarySystem {
    private static final int MAX_BOOKS = 100; // Fixed array size for books
    private static final int MAX_MEMBERS = 100; // Fixed array size for members
    private static Book[] books = new Book[MAX_BOOKS];
    private static Member[] members = new Member[MAX_MEMBERS];
    private static int bookCount = 0; // Counter for books
    private static int memberCount = 0; // Counter for members

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> addMember(scanner);
                case 3 -> displayBooks();
                case 4 -> displayMembers();
                case 5 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addBook(Scanner scanner) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Library is at full capacity for books.");
            return;
        }
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        books[bookCount++] = new Book(title, author); // Add book to the array
        System.out.println("Book added successfully.");
    }

    private static void addMember(Scanner scanner) {
        if (memberCount >= MAX_MEMBERS) {
            System.out.println("Library is at full capacity for members.");
            return;
        }
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        members[memberCount++] = new Member(name); // Add member to the array
        System.out.println("Member added successfully.");
    }

    private static void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nBooks in the Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    private static void displayMembers() {
        if (memberCount == 0) {
            System.out.println("No members in the library.");
            return;
        }
        System.out.println("\nMembers in the Library:");
        for (int i = 0; i < memberCount; i++) {
            members[i].displayInfo();
        }
    }
}
