/**
 * Abstract superclass for all library items.
 */
public abstract class LibraryItem {
    protected String title;
    protected int itemId;

    /**
     * Constructor for library items.
     * @param title the title of the library item
     * @param itemId the unique identifier for the item
     */
    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    /**
     * Abstract method to display information about the item.
     * @return A string representation of the library item.
     */
    public abstract String display();
}
