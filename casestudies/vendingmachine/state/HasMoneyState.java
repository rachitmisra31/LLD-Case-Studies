    package casestudies.vendingmachine.state;

import casestudies.vendingmachine.VendingMachine;
import casestudies.vendingmachine.enums.Coin;

public class HasMoneyState extends VendingMachineState {
    public HasMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Already received full amount.");
    }

    @Override
    public void selectItem(String code) {
        System.out.println("Item already selected.");
    }

    @Override
    public void dispense() {
        int quantity = 1; // You can modify this to retrieve the desired quantity
        vendingMachine.dispenseItem(quantity); // Call dispenseItem with the specified quantity
    }

    @Override
    public void refund() {
        vendingMachine.refundBalance();
        vendingMachine.setState(new IdleState(vendingMachine));
    }
}