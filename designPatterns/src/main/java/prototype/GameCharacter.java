package prototype;

public class GameCharacter implements Prototype{

    private  String name;
    private String weapon;

    GameCharacter(String name, String weapon){
        this.name = name;
        this.weapon = weapon;
    }
    @Override
    public Prototype clone() {
        return new GameCharacter(name, weapon);
    }

    public void display(){
        System.out.println("Sakshi has a solid punch");
    }
}
