package decorator;

public class PlainCoffee implements Coffee{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Plain Black Coffee";
    }
}
