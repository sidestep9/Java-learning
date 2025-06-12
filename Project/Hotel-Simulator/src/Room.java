
public class Room {
    int roomId;
    static int counter = 101;
    String type;
    double price;
    boolean isAvailable;
    int duration = 0;
    
    Room(String type, double price) {
        this.type = type;
        this.price = price;
        this.roomId = counter++;
        this.isAvailable = true;
    }
    
    void displayInfo() {
        System.out.printf("Room %d\n", roomId);
        System.out.println("Type       : " + type);
        System.out.printf("Price      : $%.2f\n", price);
        System.out.println("Bookable   : " + (isAvailable ? "Yes" : "No"));
        System.out.println();
        System.out.print("Description: ");
        if(type.equalsIgnoreCase("single room")) {
            System.out.println("1 single bed");
        }
        else if(type.equalsIgnoreCase("double room")) {
            System.out.println("1 large bed");
        }
        else if(type.equalsIgnoreCase("twin room")) {
            System.out.println("2 single bed");
        }
        else if(type.equalsIgnoreCase("suite")) {
            System.out.println("1 large bed, 2 single bed, and living area");
        }
    }
    
    void bookInfo() {
        System.out.printf("Room %d\n", roomId);
        System.out.println("Type       : " + type);
        System.out.println("Duration   : " + duration + " day" + (duration <= 1 ? "" : "s"));
    }
}