package casestudies.vendingmachine.entity;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private final Map<String, Item> itemMap = new HashMap<>();
    private final Map<String, Integer> stockMap = new HashMap<>();

    public void addItem(String code, Item item, int quantity){
        itemMap.put(code, item);
        stockMap.put(code, quantity);
    }

    public Item getItem(String code){
        return itemMap.get(code);
    }

    public boolean isAvailable(String code){
        return stockMap.getOrDefault(code,0)>0;
    }

    public void reduceStock(String code, int quantity) {
        if (stockMap.get(code) >= quantity) {
            stockMap.put(code, stockMap.get(code) - quantity);
        } else {
            throw new IllegalArgumentException("Not enough stock to reduce");
        }
    }
}