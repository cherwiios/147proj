import java.util.Scanner;

public class LibrarySystem {
    private static final int MAX_BOOKS = 100;
    private static final int MAX_MEMBERS = 100;
    private static Book[] books = new Book[MAX_BOOKS];
    private static Member[] members = new Member[MAX_MEMBERS];
    private static int bookCount = 0;
    private static int memberCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Calculate Overdue Fine");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            
            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> addMember(scanner);
                case 3 -> displayBooks();
                case 4 -> displayMembers();
                case 5 -> calculateFine(scanner);
                case 6 -> running = false;
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
        // Use Math.random() to generate a unique random book ID
        int randomId = (int) (Math.random() * 10000) + 1;
        books[bookCount++] = new Book(title, author, randomId);
        System.out.println("Book added successfully with ID: " + randomId);
    }

    private static void addMember(Scanner scanner) {
        if (memberCount >= MAX_MEMBERS) {
            System.out.println("Library is at full capacity for members.");
            return;
        }
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        members[memberCount++] = new Member(name);
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

    private static void calculateFine(Scanner scanner) {
        System.out.print("Enter the number of overdue days: ");
        int overdueDays = scanner.nextInt();

        // Use Math.ceil() and Math.min() to calculate fine
        double fine = Math.min(50.0, Math.ceil(overdueDays * 2.5));
        System.out.printf("The overdue fine is: $%.2f%n", fine);
    }
}


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
