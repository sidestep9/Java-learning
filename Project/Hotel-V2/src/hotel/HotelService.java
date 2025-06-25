package hotel;
import java.util.ArrayList;

public class HotelService {
    private ArrayList<Room> rooms = new ArrayList<>();
    
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public Room searchRoom(int id) {
        for(Room room : rooms) {
            if(room.getId() == id) {
                return room;
            }
        }
        System.out.println("\nRoom not found");
        return null;
    }
    public void showAllRoom(boolean isStaff) {
        ArrayList<String> roomTypes = new ArrayList<>();
        int total;
        int available;
        StringBuilder ids;
        String roomIds;
        
        for(Room room : rooms) {
            if(roomTypes.contains(room.getType())) continue;
            
            total = 0;
            available = 0;
            ids = new StringBuilder();
            roomIds = "";
            
            for(Room r : rooms) {
                if(r.getType().equals(room.getType())) {
                    total++;
                    if(r.getBookable()) {
                        available++;
                        ids.append(r.getId()).append(" [✓] | ");
                    }
                    else {
                        ids.append(r.getId()).append(" [X] | ");
                    }
                }
            }
            
            roomIds = ids.toString().trim();
            
            room.displayInfo(isStaff, roomIds, total, available);
            
            roomTypes.add(room.getType());
        }
    }
}