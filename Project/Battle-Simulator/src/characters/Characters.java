package characters;

public abstract class Characters {
    protected String name;
    protected int hp;
    protected int mp;
    protected int atk;
    protected int matk;
    protected int def;
    protected int mdef;
    protected double skillMod;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    
    public int getMatk() {
        return matk;
    }
    public void setMatk(int matk) {
        this.matk = matk;
    }
    
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    
    public int getMdef() {
        return mdef;
    }
    public void setMdef(int mdef) {
        this.mdef = mdef;
    }
    
    public double getSkillMod() {
        return skillMod;
    }
    public void setSkillMod(double skillMod) {
        this.skillMod = skillMod;
    }
}