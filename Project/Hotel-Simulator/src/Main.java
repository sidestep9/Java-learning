
public class Main {
    
    public static void main(String[] args) {
        //temp
        Staff staff = new Staff("staff", 123);
        Hotel hotel = new Hotel();
        hotel.hotelRoom();
        
        MenuUI menuUI = new MenuUI();
        StaffHandler staffHandler = new StaffHandler(staff, hotel);
        GuestHandler guestHandler = new GuestHandler(hotel);
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== ACCESS MENU ===",
                                     "Enter choice: ",
                                     "[1] Staff",
                                     "[2] Guest",
                                     "[3] Exit");
            switch(choice) {
                case 1:
                    staffHandler.credential();
                break;
                case 2:
                    guestHandler.menu();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
        menuUI.divider();
        System.out.println("Goodbye and have a nice day!");
    }
    
}