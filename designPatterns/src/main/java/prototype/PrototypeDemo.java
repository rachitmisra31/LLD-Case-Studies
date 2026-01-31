package prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("Sakshi", "Punch");
        gameCharacter.display();

        System.out.println("Using Cloned Object");

        GameCharacter clonedGameCharacter = (GameCharacter) gameCharacter.clone();
        clonedGameCharacter.display();
    }
}
