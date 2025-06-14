package characters;

public abstract class Player extends Characters implements Actionable {
    int skillChoice;
    
    Player() {
        this.hp = 100;
        this.mp = 100;
        this.atk = 10;
        this.matk = 10;
        this.def = 10;
        this.mdef = 10;
        this.skillMod = 1;
        this.skillChoice = 0;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void skill();
    public abstract void skillMenu();
    @Override
    public abstract void magic();
    
    public int getSkillChoice() {
        return skillChoice;
    }
    public void setSkillChoice(int input) {
        this.skillChoice = input;
    }
}