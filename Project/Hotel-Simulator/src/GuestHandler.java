
public class GuestHandler {
    MenuUI menuUI = new MenuUI();
    Hotel hotel;
    GuestLogic guestLogic;
    
    GuestHandler(Hotel hotel) {
        this.hotel = hotel;
        this.guestLogic = new GuestLogic(hotel);
    }
    
    void menu() {
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== STAFF MENU ===",
                                     "Enter choice: ",
                                     "[1] Show all room",
                                     "[2] Show booking",
                                     "[3] Book room",
                                     "[4] Cancel book",
                                     "[5] Exit");
            switch(choice) {
                case 1:
                    hotel.showAllRoom();
                break;
                case 2:
                    guestLogic.showBooking();
                break;
                case 3:
                    bookRoom();
                break;
                case 4:
                    cancelBook();
                break;
                case 5:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void bookRoom() {
        int choice;
        int duration;
        
        choice = menuUI.showMenu("Select room",
                                 "Enter choice: ",
                                 "[1] Single room",
                                 "[2] Double room",
                                 "[3] Twin room",
                                 "[4] Suite");
        duration = InputHandler.inputInt("Enter how long to stay (days): ");
        guestLogic.setBooking(choice, duration);
    }
    void cancelBook() {
        int id;
        
        id = InputHandler.inputInt("Enter room id: ");
        guestLogic.cancelBook(id);
    }
}