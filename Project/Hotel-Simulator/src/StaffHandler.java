
public class StaffHandler {
    MenuUI menuUI = new MenuUI();
    Staff staff;
    StaffLogic staffLogic;
    Hotel hotel;
    
    StaffHandler(Staff staff, Hotel hotel) {
        this.staff = staff;
        this.hotel = hotel;
        this.staffLogic = new StaffLogic(staff, hotel);
    }
    
    void credential() {
        String username;
        int pin;
        
        menuUI.divider();
        username = InputHandler.inputText("Enter username: ");
        pin = InputHandler.inputInt("Enter PIN: ");
        
        if(!staffLogic.getCredential(username, pin)) {
            System.out.println("Wrong username/pin");
            return;
        }
        else {
            menu();
        }
    }
    
    void menu() {
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== STAFF MENU ===",
                                     "Enter choice: ",
                                     "[1] Show all room",
                                     "[2] Search room",
                                     "[3] Update room info",
                                     "[4] Exit");
            switch(choice) {
                case 1:
                    hotel.showAllRoom();
                break;
                case 2:
                    searchRoom();
                break;
                case 3:
                    updateRoom();
                break;
                case 4:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void searchRoom() {
        int target;
        
        target = InputHandler.inputInt("Enter room ID: ");
        menuUI.separator();
        staffLogic.getRoom(target).displayInfo();
        menuUI.separator();
    }

    void updateRoom() {
        int choice;
        int target;
        Room room;
        
        menuUI.divider();
        target = InputHandler.inputInt("Enter room ID: ");
        room = staffLogic.getRoom(target);
        menuUI.separator();
        room.displayInfo();
        menuUI.separator();
        
        choice = menuUI.showMenu("",
                                 "Enter choice: ",
                                 "[1] Edit price",
                                 "[2] Edit booking status");
        switch(choice) {
            case 1:
                updatePrice(room);
            break;
            case 2:
                updateStatus(room);
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
    void updatePrice(Room room) {
        double price;
        price = InputHandler.inputDouble("Enter new price: ");
        staffLogic.setPrice(room, price);
    }
    void updateStatus(Room room) {
        String status;
        status = InputHandler.inputText("Enter booking status (Y/N): ").toLowerCase();
        staffLogic.setStatus(room, status);
    }
}