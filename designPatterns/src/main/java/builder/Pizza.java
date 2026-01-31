package builder;

public class Pizza {

    private final String dough;
    private final String sauce;

    //optional
    private final boolean extraToppings;
    private final boolean veggies;
    private final boolean cheese;

    public Pizza(PizzaBuilder builder){
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.extraToppings = builder.extraToppings;
        this.veggies = builder.veggies;
        this.cheese = builder.cheese;
    }
    public void display(){
        System.out.println("Pizza has dough: " + dough + " and sauce: " + sauce);
        if(extraToppings){
            System.out.println("Extra toppings added");
        }
        if(veggies){
            System.out.println("Veggies added");
        }
        if(cheese){
            System.out.println("Cheese added");
        }
    }
    static class PizzaBuilder{
        //mandatory fields
        private final String dough;
        private final String sauce;

        private boolean extraToppings = false;
        private boolean veggies = false;
        private boolean cheese = false;

        public PizzaBuilder(String dough, String sauce){
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder withExtraToppings(){
            this.extraToppings = true;
            return this;
        }

        public PizzaBuilder withVeggies(){
            this.veggies = true;
            return this;
        }

        public PizzaBuilder withCheese(){
            this.cheese = true;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

}