/**
 * Represents a library member.
 */
public class Member {
    private String name;
    private int memberId;
    private static int memberCounter = 0;

    /**
     
     * @param name The name of the member.
     */
    public Member(String name) {
        this.name = name;
        this.memberId = ++memberCounter;
    }

    /**
     * Displays basic information about the member.
     */
    public void displayInfo() {
        displayInfo(false);
    }

    /**
     * Displays information about the member, with the option to show or hide the member ID.
     * @param showID If true, the member ID will be included in the display.
     */
    public void displayInfo(boolean showID) {
        if (showID) {
            System.out.println("Member ID: " + memberId + ", Name: " + name);
        } else {
            System.out.println("Name: " + name);
        }
    }
}
