package hotel;
import utility.MenuUI;

public class Room {
    MenuUI menu = new MenuUI();
    private int id;
    private static int counter = 101;
    private String type;
    private double price;
    private boolean isBookable;
    
    public Room(String type, double price) {
        this.id = counter++;
        this.type = type;
        this.price = price;
        this.isBookable = true;
    }
    
    public void displayInfo() {
        menu.separator();
        System.out.println("Room ID: " + this.id);
        System.out.println("Type   : " + this.type);
        System.out.printf("Price  : $%.2f\n", this.price);
        description();
        menu.separator();
    }
    public void displayInfo(boolean isStaff, String rooms, int total, int available) {
        menu.separator();
        if(isStaff) System.out.println("Rooms       : " + rooms);
        System.out.println("Type        : " + this.type);
        System.out.printf("Price       : $%.2f\n", this.price);
        if(isStaff) {
            System.out.println("Availability: " + available + "/" + total);
        }
        else {
            System.out.println("Bookable    : " + (available > 0 ? "Yes" : "No"));
        }
        System.out.println();
        description();
        menu.separator();
    }
    public void displayBookings() {
        menu.separator();
        System.out.println("Room ID : " + this.id);
        System.out.println("Type    : " + this.type);
        System.out.println("Duration: " + " night(s)");
        menu.separator();
    }
    private void description() {
        switch(this.type) {
            case "Single":
                System.out.println("One single bed, a private bathroom, a desk, and free wifi");
            break;
            case "Double":
                System.out.println("One full-size (double) bed, a private bathroom, a smart tv, a desk, and free wifi");
            break;
            case "Twin":
                System.out.println("Two single beds, a private bathroom, a smart tv, a desk, and free wifi");
            break;
            case "Suite":
                System.out.println("One king-sized bed, two single bed, a living room, a private shower, a balcony");
            break;
            default:
                System.out.println("Unknown type");
        }
    }
    
    public int getId() {
        return this.id;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
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