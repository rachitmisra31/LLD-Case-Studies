package casestudies.vendingmachine.state;

import casestudies.vendingmachine.VendingMachine;
import casestudies.vendingmachine.enums.Coin;

public class IdleState extends VendingMachineState {
    public IdleState(VendingMachine machine) {
        super(machine);
    }


    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please select an item before inserting money.");
    }


    @Override
    public void selectItem(String code) {
        if (!vendingMachine.getInventory().isAvailable(code)) {
            throw new IllegalStateException("This item is not available.");
        }
        vendingMachine.setSelectedItemCode(code);
        vendingMachine.setState(new ItemSelectedState(vendingMachine));
        System.out.println("Item selected: " + code);
    }

    @Override
    public void dispense() {
        System.out.println("No item selected.");
    }

    @Override
    public void refund() {
        System.out.println("No money to refund.");
    }
}