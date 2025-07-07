package user;
import utility.MenuUI;
import utility.InputHandler;
import hotel.Room;
import hotel.HotelService;

public class StaffHandler {
    MenuUI menu = new MenuUI();
    HotelService hotelService;
    StaffService service;
    Staff staff;
    
    public StaffHandler(HotelService hotelService) {
        this.hotelService = hotelService;
        this.service = new StaffService(hotelService);
    }
    
    public void staffAccount() {
        service.staffAccount();
    }
    
    public void authMenu() {
        String username;
        String password;
        
        menu.divider();
        username = InputHandler.inputText("Enter username: ");
        password = InputHandler.inputText("Enter password: ");
        staff = service.login(username, password);
        
        if(staff != null) mainMenu();
        
    }
    
    private void mainMenu() {
        int choice;
        boolean isExit = false;
        
        while(!isExit) {
            menu.divider();
            choice = menu.showMenu2("=== STAFF MENU ===",
                                    "Enter choice: ",
                                    "[1] Add room",
                                    "[2] Remove room",
                                    "[3] Edit booking status",
                                    "[4] Show all rooms",
                                    "[5] Exit");
            switch(choice) {
                case 1:
                    addRoom();
                break;
                case 2:
                    removeRoom();
                break;
                case 3:
                    editBookable();
                break;
                case 4:
                    service.showAllRoom();
                break;
                case 5:
                    isExit = true;
                break;
                default:
                    menu.separator();
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private void addRoom() {
        String type;
        
        menu.separator();
        type = InputHandler.inputName("Enter room type: ").toUpperCase();
        
        service.addRoom(type);
    }
    private void removeRoom() {
        int id;
        
        menu.separator();
        id = InputHandler.inputInt("Enter room ID: ");
        
        service.removeRoom(id);
    }
    private void editBookable() {
        int id;
        
        menu.separator();
        id = InputHandler.inputInt("Enter room ID: ");
        
        service.editBookable(id);
    }
}