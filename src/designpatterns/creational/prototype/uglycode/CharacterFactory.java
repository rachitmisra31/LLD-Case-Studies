package designpatterns.creational.prototype.uglycode;

public class CharacterFactory {

    public CHaracter createCharacterWithNewName(String name){
        return new CHaracter(name,"100", 50,1);
    }

    public CHaracter createCharacterWithNewHealth(String health){
        return new CHaracter("Default Name",health, 50,1);
    }

    public CHaracter createCharacterWithNewLevel(int attackPower){
        return new CHaracter("Default Name","100", 50,1);
    }
    public CHaracter createCharacterWithNewAttackPower(int attackPower){
        return new CHaracter("Default Name","100", attackPower,1);
    }

}
