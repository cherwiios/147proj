// Class definition for Member
public class Member {
    // Private fields for member's name and ID
    private String name;
    private int memberId;

    // Static field to keep track of the number of members
    private static int memberCounter = 0;

    // Constructor to initialize the Member object with a name
    public Member(String name) {
        this.name = name; // Assigns the name passed to the constructor
        this.memberId = ++memberCounter; // Increments memberCounter and assigns it to memberId
    }

    // Method to display information about the member
    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
