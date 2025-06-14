import utility.MenuUI;
import utility.InputHandler;
import characters.Warrior;
import battle.GameUI;

public class Main {
    
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        int choice;
        boolean isExit = false;
        Warrior warrior = new Warrior();
        GameUI gameUI;
        
        System.out.println();
        
        menuUI.divider();
        do {
            choice = menuUI.showMenuReader("=== RPG BATTLE SIMULATOR ===",
                                     "Select your class: ",
                                     "[1] Warrior",
                                     "[2] Rogue",
                                     "[3] Mage",
                                     "[4] Exit");
            switch(choice) {
                case 1:
                    gameUI = new GameUI(warrior);
                    gameUI.battleMenu();
                break;
                case 4:
                    isExit = true;
                break;
                default:
                    System.out.println("Please pick between 1-3");
            }   
        }while(!isExit);
        menuUI.divider();
        System.out.println("Thank you for playing!");
    }
}