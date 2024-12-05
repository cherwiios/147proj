public class Member {
    private String name;
    private int memberId;
    private static int memberCounter = 0;

    public Member(String name) {
        this.name = name;
        this.memberId = ++memberCounter;
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
