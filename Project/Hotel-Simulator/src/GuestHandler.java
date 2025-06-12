
public class GuestHandler {
    MenuUI menuUI = new MenuUI();
    Hotel hotel;
    GuestLogic guestLogic;
    Guest guest;
    
    GuestHandler(Hotel hotel) {
        this.hotel = hotel;
        this.guestLogic = new GuestLogic(hotel);
    }
    
    void registration() {
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== GUEST REGISTRATION ===",
                                     "Enter choice: ",
                                     "[1] Login",
                                     "[2] Sign up",
                                     "[3] Exit");
            switch(choice) {
                case 1:
                    login();
                break;
                case 2:
                    signup();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void login() {
        String username;
        int pin;
        
        menuUI.divider();
        username = InputHandler.inputText("Enter username: ");
        pin = InputHandler.inputInt("Enter PIN: ");
        this.guest = guestLogic.guestLogin(username, pin);
        if(guest == null) {
            System.out.println("Wrong username/PIN");
            return;
        }
        menu();
    }
    
    void signup() {
        String username;
        int pin;
        
        menuUI.divider();
        username = InputHandler.inputText("Enter username: ");
        pin = InputHandler.inputInt("Enter PIN (6-digit): ");
        guestLogic.guestSignup(username, pin);
    }
    
    void menu() {
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== GUEST MENU ===",
                                     "Enter choice: ",
                                     "[1] Show all room",
                                     "[2] Show booking",
                                     "[3] Book room",
                                     "[4] Cancel book",
                                     "[5] Checkout",
                                     "[6] Exit");
            switch(choice) {
                case 1:
                    hotel.showAllRoom(false);
                break;
                case 2:
                    guestLogic.showBooking(guest);
                break;
                case 3:
                    bookRoom();
                break;
                case 4:
                    cancelBook();
                break;
                case 5:
                    checkout();
                break;
                case 6:
                    this.guest = null;
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
        if(duration < 1) {
            System.out.println("Invalid duration");
            return;
        }
        guestLogic.setBooking(guest, choice, duration);
    }
    void cancelBook() {
        int id;
        
        id = InputHandler.inputInt("Enter room id: ");
        guestLogic.cancelBook(guest, id);
    }
    
    void checkout() {
        double total;
        boolean yesConfirm;

        total = guestLogic.checkout(guest);
        yesConfirm = menuUI.confirmation("Confirm payment (Y/N): ");
        if(yesConfirm) {
            guestLogic.printCheckout(guest, total);
            System.out.println("Payment recieved. Thank you!");
        }
        else {
            System.out.println("Payment cancelled");
        }
    }
}