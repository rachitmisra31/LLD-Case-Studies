package designpatterns.creational.prototype.goodcode;

public class Character implements Cloneable{
    private String name;
    private String health;
    private int attackPower;
    private int level;

    public Character(String name, String health, int attackPower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone(); // Shallow copy of the character object
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getLevel() {
        return level;
    }

    public void showCharacterInfo(){
        System.out.println("Name: "+name+", health: "+health+", level: "+level);
    }
}