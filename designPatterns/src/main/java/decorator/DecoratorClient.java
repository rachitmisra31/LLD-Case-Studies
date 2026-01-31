package decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        PlainCoffee plainCoffee = new PlainCoffee();
        System.out.println(plainCoffee.getCost());

        MilkCoffee milkCoffee = new MilkCoffee(new PlainCoffee());
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());
    }
}
