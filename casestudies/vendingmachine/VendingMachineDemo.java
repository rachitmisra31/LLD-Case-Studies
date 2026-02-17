package casestudies.vendingmachine;

import casestudies.vendingmachine.enums.Coin;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        // Add products to the inventory
        vendingMachine.addItem("A1", "Coke", 25, 3);
        vendingMachine.addItem("A2", "Pepsi", 25, 2);
        vendingMachine.addItem("B1", "Water", 10, 5);

        // Select a product
        System.out.println("\n--- Step 1: Select an item ---");
        vendingMachine.selectItem("A1");

        // Insert coins
        System.out.println("\n--- Step 2: Insert coins ---");
        vendingMachine.insertCoin(Coin.DIME); // 10
        vendingMachine.insertCoin(Coin.DIME); // 10
        vendingMachine.insertCoin(Coin.NICKEL); // 5
        vendingMachine.insertCoin(Coin.QUARTER); // 25

        // Specify quantity for dispensing
        int quantityToDispense = 1; // You can modify this value based on user input
        System.out.println("\n--- Step 3: Dispense item ---");
        vendingMachine.dispenseItem(quantityToDispense); // Call dispenseItem with the specified quantity

        // Select another item
        System.out.println("\n--- Step 4: Select another item ---");
        vendingMachine.selectItem("B1");

        // Insert more amount
        System.out.println("\n--- Step 5: Insert more than needed ---");
        vendingMachine.insertCoin(Coin.QUARTER); // 25

        // Specify quantity for the second item
        quantityToDispense = 2; // Again, you can modify this value based on user input
        System.out.println("\n--- Step 6: Dispense and return change ---");
        vendingMachine.dispenseItem(quantityToDispense); // Call dispenseItem with the specified quantity
    }
}