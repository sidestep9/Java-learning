
public class AdminMenu {
    
    MenuUI menuUI = new MenuUI();
    UserData userData = new UserData();
    AdminLogic adminLogic = new AdminLogic();
    
    void mainMenu() {
        int choice;
        boolean isExit = false;
        
        do{
            choice = menuUI.showMenu("=== ADMIN MENU ===",
                                     "Enter: ",
                                     "[1] Add user",
                                     "[2] Remove user",
                                     "[3] Edit user",
                                     "[4] Reset PIN ",
                                     "[5] Exit");
            InputUtil.separator();
            switch(choice) {
                case 1:
                    addUser();
                break;
                case 5:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void addUser() {
        String name = "";
        String role = "";
        int pin = 0;
        
        while(role.isEmpty() || !role.equalsIgnoreCase("teacher") && !role.equalsIgnoreCase("student")){
            role = adminLogic.validRole(InputUtil.inputLine("Enter role: "));
            System.out.println();
        }
        while(name.isEmpty()) {
            name = InputUtil.inputLine("Enter name: ");
            System.out.println();
        }
        while(String.valueOf(pin).length() != 6) {
            pin = adminLogic.validPin(InputUtil.inputInt("Enter PIN (must be 6-digit): "));
            System.out.println();
        }
        System.out.println("New user added");
    }
}