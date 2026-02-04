package designpatterns.creational.prototype.goodcode;

public class CharacterClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1 = characterFactory.createCharacterWithNewHealth("Perfect Health");
        character1.showCharacterInfo();
    }
}
