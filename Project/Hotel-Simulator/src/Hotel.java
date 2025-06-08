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
}