package user;
import utility.MenuUI;
import utility.InputHandler;
import hotel.Room;
import hotel.HotelService;

public class GuestHandler {
    MenuUI menu = new MenuUI();
    HotelService hotelService;
    GuestService service;
    Guest guest;
    
    public GuestHandler(HotelService hotelService) {
        this.hotelService = hotelService;
        this.service = new GuestService(hotelService);
    }
    
    public void readGuestAccount() {
        service.readGuestAccount();
    }
    public void writeGuestAccount() {
        service.writeGuestAccount();
    }
    
    public void authMenu() {
        int choice;
        
        menu.divider();
        choice = menu.showMenu3("Enter choice: ",
                                "[1] Login",
                                "[2] Sign up");
        switch(choice) {
            case 1:
                login();
            break;
            case 2:
                signup();
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void signup() {
        String username;
        String password;
        
        menu.divider();
        username = InputHandler.inputText("Enter username: ");
        password = InputHandler.inputText("Enter password: ");
        service.signup(username, password);
    }
    private void login() {
        String username;
        String password;
        
        menu.divider();
        username = InputHandler.inputText("Enter username: ");
        password = InputHandler.inputText("Enter password: ");
        guest = service.login(username, password);
        service.readGuestBooking(guest);
        
        if(guest != null) mainMenu();
    }
    
    private void mainMenu() {
        int choice;
        boolean isExit = false;
        
        while(!isExit) {
            menu.divider();
            choice = menu.showMenu2("=== GUEST MENU ===",
                                    "Enter choice: ",
                                    "[1] Show all rooms",
                                    "[2] Show bookings",
                                    "[3] Book a room",
                                    "[4] Cancel book",
                                    "[5] Checkout",
                                    "[6] Exit");
            switch(choice) {
                case 1:
                    service.showAllRoom();
                break;
                case 2:
                    service.showBookings();
                break;
                case 3:
                    addBooking();
                break;
                case 4:
                    removeBooking();
                break;
                case 5:
                    service.checkout(guest);
                break;
                case 6:
                    service.writeGuestBooking();
                    service.clearBooking();
                    guest = null;
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private void addBooking() {
        int choice;
        int nights;
        
        menu.divider();
        System.out.println("Choose room\n");
        choice = menu.showMenu3("Enter choice: ",
                                "[1] Single",
                                "[2] Double",
                                "[3] Twin",
                                "[4] Suite");
        nights = InputHandler.inputInt("Enter duration of stay (nights): ");
        service.addBooking(guest, choice, nights);
    }
    private void removeBooking() {
        int roomId;
        
        menu.divider();
        roomId = InputHandler.inputInt("Enter room id: ");
        service.removeBooking(roomId);
    }
}