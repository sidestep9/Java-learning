package user;
import hotel.HotelService;
import hotel.Room;
import utility.MenuUI;

public class StaffService {
    HotelService hotelService = new HotelService();
    MenuUI menu = new MenuUI();
    
    protected Room searchRoom(int id) {
        return hotelService.searchRoom(id);
    }
    protected void addRoom(String type, double price) {
        hotelService.getRooms().add(new Room(type, price));
        System.out.println("\nRoom added");
    }
    protected void removeRoom(int id) {
        Room room = searchRoom(id);
        
        if(room == null) return;
        
        hotelService.getRooms().remove(room);
        System.out.println("\nRoom removed");
    }
    protected void editType(String type, Room room) {
        room.setType(type);
        System.out.println("\nType changed");
    }
    protected void editPrice(double price, Room room) {
        room.setPrice(price);
        System.out.println("\nPrice changed");
    }
    protected void editBookable(Room room) {
        room.setBookable();
        System.out.println("\nBooking status changed");
    }
    protected void showAllRoom() {
        menu.divider();
        hotelService.showAllRoom(true);
    }
}