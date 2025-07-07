package user;
import hotel.HotelService;
import hotel.Room;
import hotel.RoomType;
import utility.MenuUI;

public class StaffService {
    HotelService hotelService;
    MenuUI menu = new MenuUI();
    StaffRepository staffRepo = new StaffRepository();
    
    protected StaffService(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    
    protected void staffAccount() {
        staffRepo.staffAccount();
    }
    
    protected Staff login(String username, String password) {
        Staff staff = staffRepo.login(username, password);
        if(staff != null) {
            System.out.println("\nWelcome!");
            return staff;
        }
        System.out.println("\nInvalid username/password");
        return null;
    }
    
    protected Room searchRoom(int id) {
        return hotelService.searchRoom(id);
    }
    protected void addRoom(String type) {
        RoomType room = RoomType.valueOf(type);
        hotelService.getRooms().add(new Room(room));
        System.out.println("\nRoom added");
    }
    protected void removeRoom(int id) {
        Room room = searchRoom(id);
        
        if(room == null) return;
        
        hotelService.getRooms().remove(room);
        System.out.println("\nRoom removed");
    }
    protected void editBookable(int id) {
        Room room = searchRoom(id);
        
        if(room == null) return;
        
        room.setBookable();
        System.out.println("\nBooking status changed");
    }
    protected void showAllRoom() {
        menu.divider();
        hotelService.showAllRoom(true);
    }
}