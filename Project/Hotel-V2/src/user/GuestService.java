package user;
import hotel.HotelService;
import hotel.Room;
import utility.MenuUI;

public class GuestService {
    HotelService hotelService = new HotelService();
    GuestRepository guestRepo = new GuestRepository();
    MenuUI menu = new MenuUI();
    
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
        guest.displayBookings();
    }
    protected void addBooking(Guest guest, int choice) {
        boolean booked = false;
        
        for(Room room : hotelService.getRooms()) {
            if(!room.getBookable()) continue;
            
            switch(choice) {
                case 1:
                    if(!room.getType().equalsIgnoreCase("single")) break;
                    guest.getBookings().add(room);
                    room.setBookable();
                    booked = true;
                break;
                case 2:
                    if(!room.getType().equalsIgnoreCase("double")) break;
                    guest.getBookings().add(room);
                    room.setBookable();
                    booked = true;
                break;
                case 3:
                    if(!room.getType().equalsIgnoreCase("twin")) break;
                    guest.getBookings().add(room);
                    room.setBookable();
                    booked = true;
                break;
                case 4:
                    if(!room.getType().equalsIgnoreCase("single")) break;
                    guest.getBookings().add(room);
                    room.setBookable();
                    booked = true;
                break;
                default:
                    booked = false;
            }
            
            if(booked) {
                room.displayBookings();
                System.out.println("\nRoom successfully booked!");
            }
        }
    }
}