import utility.MenuUI;
import utility.InputHandler;
import user.StaffHandler;
import user.GuestHandler;
import hotel.HotelService;

public class Main {
    
    public static void main(String[] args) {
        MenuUI menu = new MenuUI();
        HotelService hotelService = new HotelService();
        StaffHandler staffHandler = new StaffHandler(hotelService);
        GuestHandler guestHandler = new GuestHandler(hotelService);
        int choice;
        boolean isExit = false;
        
        staffHandler.staffAccount();
        guestHandler.readGuestAccount();
        hotelService.readHotelRoom();
        
        while(!isExit) {
            menu.divider();
            System.out.println("HOTEL SIMULATOR V2");
            menu.divider();
            choice = menu.showMenu2("=== MAIN MENU ===",
                                    "Enter choice: ",
                                    "[1] Staff",
                                    "[2] Guest",
                                    "[3] Exit");
            switch(choice) {
                case 1:
                    staffHandler.authMenu();
                break;
                case 2:
                    guestHandler.authMenu();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    menu.separator();
                    System.out.println("Invalid choice");
            }
        }
        
        guestHandler.writeGuestAccount();
        hotelService.writeHotelRoom();
        
        menu.divider();
        System.out.println("Goodbye & have a nice day!");
        menu.divider();
        
    }
    
}