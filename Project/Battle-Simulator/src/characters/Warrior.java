package characters;
import utility.MenuUI;

public class Warrior extends Player{
    MenuUI menuUI = new MenuUI();
    
    public Warrior() {
        this.name = "Warrior";
        this.hp *= 2;
        this.mp *= 0.5;
        this.atk *= 1.5;
    }
    
    @Override
    public void attack() {
        
    }
    @Override
    public void skill() {
        switch(skillChoice) {
            case 1:
                System.out.println("You smash your weapon against the enemy");
                this.skillMod = 1.5;
            break;
            case 2:
                System.out.println("You hit the enemy twice");
                this.skillMod = 0.8;
            break;
            case 3:
                System.out.println("You braces yourself for incoming attack");
                // I'll implement buff type skills later cuz I found out that this is pretty annoying
            break;
            default:
                System.out.println("Invalid skill");
        }
    }
    @Override
    public void skillMenu() {
        menuUI.showMenu("[1] Hard hit",
                        "[2] Double hit",
                        "[3] Brace");
    }
    @Override
    public void magic() {
        
    }
}