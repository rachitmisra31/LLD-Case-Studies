package designpatterns.behaviour.template;

public abstract class Bevarage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring in Cup");
    }

     abstract void brew();

    private void boilWater() {
        System.out.println("Boiling Water");
    }
}
