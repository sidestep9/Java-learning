
public class Main {
    
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        AdminMenu adminMenu = new adminMenu();
        int choice;
        boolean isExit = false;
        
        do {
            InputUtil.divider();
            choice = menuUI.showMenu("=== ACCESS MENU ===",
                                     "Enter (1-4): ",
                                     "[1] Admin",
                                     "[2] Teacher",
                                     "[3] Student",
                                     "[4] Exit");
            switch(choice) {
                case 1:
                    adminMenu.mainMenu();
                break;
                case 4:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
        
        System.out.println("Goodbye and have a nice day!");
    }
    
}

// ADMIN
// TEACHER
// STUDENT