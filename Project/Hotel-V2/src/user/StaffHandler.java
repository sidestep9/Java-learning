package user;
import utility.MenuUI;
import utility.InputHandler;
import hotel.Room;

public class StaffHandler {
    MenuUI menu = new MenuUI();
    StaffService service = new StaffService();
    
    public StaffHandler(Room room) {
        
    }
    
    public void authMenu() {
        menu.divider();
        System.out.println("Authentication");
        mainMenu();
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
                                    "[3] Edit room",
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
                    editRoom();
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
        double price;
        
        menu.separator();
        type = InputHandler.inputName("Enter room type: ");
        price = InputHandler.inputDouble("Enter room price: ");
        
        service.addRoom(type, price);
    }
    private void removeRoom() {
        int id;
        
        menu.separator();
        id = InputHandler.inputInt("Enter room ID: ");
        
        service.removeRoom(id);
    }
    private void editRoom() {
        int id;
        Room room;
        int choice;
        
        menu.separator();
        id = InputHandler.inputInt("Enter room id: ");
        room = service.searchRoom(id);
        
        if(room == null) return;
        
        menu.separator();
        room.displayInfo();
        menu.separator();
        
        choice = menu.showMenu3("Enter choice: ",
                                "[1] Edit type",
                                "[2] Edit price",
                                "[3] Edit booking status");
        switch(choice) {
            case 1:
                editType(room);
            break;
            case 2:
                editPrice(room);
            break;
            case 3:
                editBookable(room);
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void editType(Room room) {
        String type;
        
        menu.separator();
        type = InputHandler.inputName("Enter new type: ");
        service.editType(type, room);
    }
    private void editPrice(Room room) {
        double price;
        
        menu.separator();
        price = InputHandler.inputDouble("Enter new price: ");
        service.editPrice(price, room);
    }
    private void editBookable(Room room) {
        service.editBookable(room);
    }
}