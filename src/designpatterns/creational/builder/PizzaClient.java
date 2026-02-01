package designpatterns.creational.builder;

public class PizzaClient {

    public static void main(String[] args) {
        Pizza.PizzBuilder pizzBuilder = new Pizza.PizzBuilder();
        Pizza pizza = pizzBuilder.setName("Veg FarmHouse").setPrice(121).setSauce("Tandoori").build();
        System.out.println(pizza);
    }
}
