
public class Main {
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        StaffHandler staffHandler = new StaffHandler();
        CustomerHandler customerHandler = new CustomerHandler();
        int choice;
        boolean isExit = false;
        
        // temp
        
        do {
            menuUI.divider();
            choice = menuUI.showMenu("=== ACCESS MENU ===",
                                     "Enter choice: ",
                                     "[1] Staff",
                                     "[2] Customer",
                                     "[3] Exit");
            switch(choice) {
                case 1:
                    staffHandler.credential();
                break;
                case 2:
                    customerHandler.menu();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
        
        menuUI.divider();
        System.out.println("Goodbye and have a nice day");
    }
}