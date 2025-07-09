package user;
import hotel.HotelService;
import hotel.Room;
import hotel.RoomType;
import hotel.Booking;
import utility.MenuUI;

public class GuestService {
    private HotelService hotelService;
    private GuestRepository guestRepo = new GuestRepository();
    private MenuUI menu = new MenuUI();
    
    protected GuestService(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    
    protected void readGuestAccount() {
        guestRepo.readGuestAccount();
    }
    protected void writeGuestAccount() {
        guestRepo.writeGuestAccount();
    }
    
    protected void readGuestBooking(Guest guest) {
        if(guest == null) return;
        hotelService.readGuestBooking(guest);
    }
    protected void writeGuestBooking() {
        hotelService.writeGuestBooking();
    }
    
    protected void signup(String username, String password) {
        if(guestRepo.validUsername(username)) {
            guestRepo.signup(username, password);
            System.out.println("\nRegistered successfully");
        }
        else {
            System.out.println("\nInvalid username");
        }
    }
    protected Guest login(String username, String password) {
        Guest guest = guestRepo.login(username, password);
        if(guest != null) {
            System.out.println("\nWelcome!");
            return guest;
        }
        System.out.println("\nInvalid username/password");
        return null;
    }
    protected void clearBooking() {
        hotelService.getBookings().clear();
    }
    
    protected void showAllRoom() {
        menu.divider();
        hotelService.showAllRoom(false);
    }
    protected void showBookings() {
        menu.divider();
        hotelService.showBookings();
    }
    protected void addBooking(Guest guest, int choice, int nights) {
        RoomType target;
        
        switch(choice) {
            case 1:
                target = RoomType.SINGLE;
            break;
            case 2:
                target = RoomType.DOUBLE;
            break;
            case 3:
                target = RoomType.TWIN;
            break;
            case 4:
                target = RoomType.SUITE;
            break;
            default:
                target = null;
            }
        
        if(target == null) {
            System.out.println("\nRoom unavailable");
            return;
        }
        
        hotelService.addBooking(guest, target, nights); 
    }
    protected void removeBooking(int roomId) {
        hotelService.removeBooking(roomId);
    }
    protected void checkout(Guest guest) {
        double total = 0;
        
        for(Booking book : hotelService.getBookings()) {
            total += (book.getRoom().getPrice() * book.getNights());
        }
        
        System.out.printf("\nTotal: $%.2f\n",total);
        hotelService.getBookings().clear(); //should update with time and change booking status
    }
}