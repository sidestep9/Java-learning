
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
            System.out.println("Menu");
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
                                     "[2] Update room info",
                                     "[3] Exit");
            switch(choice) {
                case 1:
                    hotel.showAllRoom();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void updateRoom() {
        int target;
        
        menuUI.divider();
        target = InputHandler.inputInt("Enter room ID: ");
    }
}