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
