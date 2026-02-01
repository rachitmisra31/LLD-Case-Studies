package designpatterns.creational.builder;

public class Pizza {
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    private String name;
    private double price;
    private String sauce;

    private Pizza(PizzBuilder pizzBuilder){
        this.name = pizzBuilder.name;
        this.price = pizzBuilder.price;
        this.sauce = pizzBuilder.sauce;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSauce() {
        return sauce;
    }

    public static class PizzBuilder{
        private String name;
        private double price;
        private String sauce;

        public PizzBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PizzBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public PizzBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
