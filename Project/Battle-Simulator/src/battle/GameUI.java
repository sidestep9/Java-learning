package battle;
import java.util.ArrayList;
import utility.MenuUI;
import utility.InputHandler;
import characters.Player;
import characters.Monster;
import characters.Goblin;

public class GameUI {
    MenuUI menuUI = new MenuUI();
    BattleLogic battleLogic = new BattleLogic();
    Player player;
    ArrayList<Monster> monsters = new ArrayList<>();
    
    public GameUI(Player player) {
        this.player = player;
        monsters.add(new Goblin());
    }
    
    public void battleMenu() {
        int choice;
        
        menuUI.divider();
        System.out.print("Enemies approaching: ");
        for(Monster monster : monsters) {
            System.out.print(monster.getName() + ", ");
        }
        System.out.println();
        for(Monster monster : monsters) {
            do {
                menuUI.divider();
                menuUI.separator();
                System.out.println(monster.getName());
                System.out.println();
                System.out.println("HP: " + monster.getHp());
                menuUI.separator();
                System.out.println();
                menuUI.separator();
                System.out.println(player.getName());
                System.out.println("HP: " + player.getHp());
                System.out.println("MP: ");
                menuUI.separator();
                menuUI.divider();
                choice = menuUI.showMenuReader("Your turn",
                                         "Choose your action: ",
                                         "[1] Attack",
                                         "[2] Skill",
                                         "[3] Magic");
                switch(choice) {
                    case 1:
                        battleLogic.attackDmg(player, monster);
                    break;
                    case 2:
                        skillMenu(monster);
                    break;
                    default:
                        System.out.println("Invalid action");
                }
                player.setHp(player.getHp() - monster.getAtk());
            }while(monster.getHp() > 0);
        }
    }
    
    void skillMenu(Monster monster) {
        menuUI.divider();
        int choice;
        
        player.skillMenu();
        menuUI.separator();
        choice = InputHandler.inputInt("Choose skill: ");
        menuUI.separator();
        battleLogic.skill(player, monster, choice);
    }
}