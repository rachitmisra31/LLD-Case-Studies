package designpatterns.creational.prototype.uglycode;

public class CharacterClient {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        CHaracter character = characterFactory.createCharacterWithNewAttackPower(50);
        character.showCharacterInfo();
    }

}
