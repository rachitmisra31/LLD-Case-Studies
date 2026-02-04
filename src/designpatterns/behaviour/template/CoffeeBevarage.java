package designpatterns.behaviour.template;

public class CoffeeBevarage extends Bevarage{
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }
}
