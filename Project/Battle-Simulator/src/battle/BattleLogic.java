package battle;
import java.util.Random;
import characters.Player;
import characters.Monster;

public class BattleLogic {
    static final double rdm = 1 + Math.random();
    
    void attackDmg(Player player, Monster monster) {
        monster.setHp(monster.getHp() - (int)(player.getAtk() * rdm));
    }
    
    void skill(Player player, Monster monster, int input) {
        switch(input) {
            case 1:
                player.setSkillChoice(1);
                player.skill();
                skillDmg(player, monster);
            break;
            case 2:
                player.setSkillChoice(2);
                player.skill();
                skillDmg(player, monster);
                skillDmg(player, monster);
            break;
            case 3:
                player.setSkillChoice(3);
                player.skill();
            break;
            default:
                System.out.println("Invalid");
        }
    }
    void skillDmg(Player player, Monster monster) {
        monster.setHp(monster.getHp() - (int)(player.getAtk() * player.getSkillMod()));
    }
}