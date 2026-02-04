package builder;

public class PizzaBuilderClient {

    public static void main(String[] args) {
        Pizza margherita = new Pizza.PizzaBuilder("Thin Crust", "Tomato").withCheese().withExtraToppings().withVeggies().build();
        margherita.display();

        Pizza veggieDelight = new Pizza.PizzaBuilder("Thick Crust", "Mozarella").withVeggies().withExtraToppings().build();
        veggieDelight.display();
    }

}