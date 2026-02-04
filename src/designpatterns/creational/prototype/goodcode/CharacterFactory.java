package designpatterns.creational.prototype.goodcode;

public class CharacterFactory {

    private Character character;
    public CharacterFactory(){
        character = new Character("DefaultName", "Full Perfect Health", 32, 70);
    }
    public Character createCharacterWithNewName(String newName) throws CloneNotSupportedException {
        Character clonedCharacter = character.clone();
        clonedCharacter.setName(newName);
        return clonedCharacter;
    }

    public Character createCharacterWithNewHealth(String newHealth) throws CloneNotSupportedException {
        Character clonedCharacter = character.clone();
        clonedCharacter.setHealth(newHealth);
        return clonedCharacter;
    }
}
