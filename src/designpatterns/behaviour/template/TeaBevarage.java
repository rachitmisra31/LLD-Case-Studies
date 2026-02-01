package designpatterns.behaviour.template;

public class TeaBevarage extends Bevarage{
    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping tea bag");
    }
}
