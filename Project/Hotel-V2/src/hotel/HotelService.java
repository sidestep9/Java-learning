package hotel;
import java.util.ArrayList;
import data.Writer;
import data.Reader;
import user.Guest;

public class HotelService {
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();
    private Writer writer = new Writer();
    private Reader reader = new Reader();
    
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public ArrayList<Booking> getBookings() {
        return bookings;
    }
    
    public void readHotelRoom() {
        reader.readHotelRoom(rooms);
    }
    public void writeHotelRoom() {
        writer.writeHotelRoom(rooms);
    }
    public void readGuestBooking(Guest guest) {
        reader.readGuestBooking(guest, bookings);
    }
    public void writeGuestBooking() {
        writer.writeGuestBooking(bookings);
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
    public Room searchAvailableRoom(RoomType type) {
        for(Room room : rooms) {
            if(!room.getBookable()) continue;
            
            if(room.getType() == type) {
                return room;
            }
        }
        System.out.println("\nNo available room");
        return null;
    }
    public void showAllRoom(boolean isStaff) {
        ArrayList<RoomType> roomTypes = new ArrayList<>();
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
    public void showBookings() {
        if(bookings == null || bookings.isEmpty()) {
            System.out.println("You haven't booked anything");
            return;
        }
        
        for(Booking booking : bookings) {
            booking.displayInfo();
        }
    }
    public void addBooking(Guest guest, RoomType type, int nights) {
        Room room = searchAvailableRoom(type);
            
        if(room == null) return;
            
        bookings.add(new Booking(guest, room, nights));
        System.out.println("Booked");
    }
    public void addBooking(Guest guest, int roomId, int nights, BookingStatus status) {
        Room room = searchRoom(roomId);
            
        if(room == null) return;
            
        bookings.add(new Booking(guest, room, nights, status));
    }
}