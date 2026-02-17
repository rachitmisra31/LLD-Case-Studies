    package casestudies.vendingmachine.entity;

    public class Item {

        private final String name;
        private final String code;
        private final int price;

        public Item(String name, String code, int price){
            this.name = name;
            this.code = code;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public int getPrice() {
            return price;
        }
    }