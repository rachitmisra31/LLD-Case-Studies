package designpatterns.creational.prototype.uglycode;

public class CHaracter {

    private String name;
    private String health;
    private int attackPower;
    private int level;

    public CHaracter(String name, String health, int attackPower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    public void showCharacterInfo(){
        System.out.println("Name: "+name+"health: "+health+" level: "+level+" attackPower: "+attackPower);
    }
}
