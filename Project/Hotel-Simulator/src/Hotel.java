import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();
    MenuUI menuUI = new MenuUI();
    
    void hotelRoom() {
        for(int i = 0; i < 5; i++) {
            rooms.add(new Room("Single Room", 50));
        }
        for(int i = 0; i < 3; i++) {
            rooms.add(new Room("Double Room", 70));
        }
        for(int i = 0; i < 3; i++) {
            rooms.add(new Room("Twin Room", 70));
        }
        for(int i = 0; i < 1; i++) {
            rooms.add(new Room("Suite", 200));
        }
    }
    
    void showAllRoom() {
        for(Room room : rooms) {
            menuUI.separator();
            room.displayInfo();
        }
        menuUI.separator();
    }
    
    void showAllRoom(boolean isStaff) {
        ArrayList<String> roomTypes = new ArrayList<>();
        int total;
        int available;
        double price;
        
        for(Room room : rooms) {
            if(roomTypes.contains(room.type)) continue;
            
            total = 0;
            available = 0;
            price = room.price;
            
            for(Room r : rooms) {
                if(r.type.equals(room.type)) {
                    total++;
                    if(room.isAvailable) available++;
                }
            }
            menuUI.separator();
            System.out.println("Type       : " + room.type);
            System.out.printf("Price      : $%.2f\n", room.price);
            if(isStaff) {
                System.out.printf("Available  : %d/%d", available, total);
            }
            else {
                System.out.println("Bookable   : " + (available > 0 ? "Yes" : "No"));
            }
            System.out.println();
            System.out.print("Description: ");
            if(room.type.equalsIgnoreCase("single room")) {
                System.out.println("1 single bed");
            }
            else if(room.type.equalsIgnoreCase("double room")) {
                System.out.println("1 large bed");
            }
            else if(room.type.equalsIgnoreCase("twin room")) {
                System.out.println("2 single bed");
            }
            else if(room.type.equalsIgnoreCase("suite")) {
                System.out.println("1 large bed, 2 single bed, and living area");
            }
            roomTypes.add(room.type);
        }
        menuUI.separator();
    }
}