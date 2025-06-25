package user;
import hotel.HotelService;
import hotel.Room;
import utility.MenuUI;

public class GuestService {
    HotelService hotelService;
    GuestRepository guestRepo = new GuestRepository();
    MenuUI menu = new MenuUI();
    
    protected GuestService(HotelService hotelService) {
        this.hotelService = hotelService;
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
    
    protected void showAllRoom() {
        menu.divider();
        hotelService.showAllRoom(false);
    }
    protected void showBookings(Guest guest) {
        menu.divider();
        guest.displayBookings();
    }
    protected void addBooking(Guest guest, int choice, int duration) {
        boolean booked;
        
        for(Room room : hotelService.getRooms()) {
            if(!room.getBookable()) continue;
            
            booked = false;
            
            switch(choice) {
                case 1:
                    if(!room.getType().equalsIgnoreCase("single")) break;
                    booked = true;
                break;
                case 2:
                    if(!room.getType().equalsIgnoreCase("double")) break;
                    booked = true;
                break;
                case 3:
                    if(!room.getType().equalsIgnoreCase("twin")) break;
                    booked = true;
                break;
                case 4:
                    if(!room.getType().equalsIgnoreCase("suite")) break;
                    booked = true;
                break;
                default:
                    booked = false;
            }
            
            if(booked) {
                room.setDuration(duration);
                room.setBookable();
                guest.getBookings().add(room);
                System.out.println();
                room.displayBookings();
                System.out.println("\nRoom successfully booked!");
                return;
            }
        }
        System.out.println("\nRoom unavailable");
    }
    protected void removeBooking(Guest guest, int id) {
        Room room = hotelService.searchRoom(id);
        
        if(room != null) {
            System.out.println();
            room.displayBookings();
            System.out.println("\nBooking cancelled");
            guest.getBookings().remove(room);
            room.setDuration(0);
            room.setBookable();
        }
    }
}