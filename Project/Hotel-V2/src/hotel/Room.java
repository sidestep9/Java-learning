package hotel;
import utility.MenuUI;

public class Room {
    private MenuUI menu = new MenuUI();
    private static int counter = 101;
    private final int id = counter++;
    private final RoomType type;
    private boolean isBookable = true;
    
    public Room(RoomType type) {
        this.type = type;
    }
    public Room(int id, RoomType type, boolean isBookable) {
        this.type = type;
        this.counter = id + 1;
        this.isBookable = isBookable;
    }
    
    public void displayInfo() {
        menu.separator();
        System.out.println("Room ID: " + this.id);
        System.out.println("Type   : " + getType());
        System.out.printf("Price  : $%.2f\n", getPrice());
        System.out.println(getDescription());
        menu.separator();
    }
    public void displayInfo(boolean isStaff, String rooms, int total, int available) {
        menu.separator();
        if(isStaff) System.out.println("Rooms       : " + rooms);
        System.out.println("Type        : " + getType());
        System.out.printf("Price       : $%.2f\n", getPrice());
        if(isStaff) {
            System.out.println("Availability: " + available + "/" + total);
        }
        else {
            System.out.println("Bookable    : " + (available > 0 ? "Yes" : "No"));
        }
        System.out.println();
        System.out.println(getDescription());
        menu.separator();
    }
    
    public String toSave(boolean isStaff) {
        String text;
        if(isStaff) {
            text = this.id + "-" + this.type + "-" + this.isBookable;
        }
        else {
            text = this.id + "-" + this.type + "-";//duration
        }
        return text;
    }
    
    public int getId() {
        return this.id;
    }
    public RoomType getType() {
        return this.type;
    }
    public double getPrice() {
        return this.type.basePrice();
    }
    public String getDescription() {
        return this.type.description();
    }
    public boolean getBookable() {
        return this.isBookable;
    }
    public void setBookable() {
        if(this.isBookable) {
            this.isBookable = false;
        }
        else {
            this.isBookable = true;
        }
    }
}