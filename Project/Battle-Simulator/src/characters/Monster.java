package characters;

public abstract class Monster extends Characters implements Actionable {
    Monster() {
        this.hp = 100;
        this.mp = 100;
        this.atk = 10;
        this.matk = 10;
        this.def = 10;
        this.mdef = 10;
        this.skillMod = 1;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void skill();
    @Override
    public abstract void magic();
}