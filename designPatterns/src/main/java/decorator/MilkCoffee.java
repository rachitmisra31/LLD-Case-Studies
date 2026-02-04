package decorator;

public class MilkCoffee extends DecoratedCoffee{
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public int getCost() {
        return decoratedCoffee.getCost() + 20;
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }
}