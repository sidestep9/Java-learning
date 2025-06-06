
public class AdminMenu {
    
    MenuUI menuUI = new MenuUI();
    
    void mainMenu() {
        int choice;
        boolean isExit = false;
        
        do{
            choice = menuUI.showMenu("=== ADMIN MENU ===",
                                     "Enter: ",
                                     "[1] ")
        }while(!isExit);
    }
}