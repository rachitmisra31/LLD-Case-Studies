package casestudies.vendingmachine.state;

import casestudies.vendingmachine.VendingMachine;
import casestudies.vendingmachine.entity.Item;
import casestudies.vendingmachine.enums.Coin;

public abstract class VendingMachineState {

   protected VendingMachine vendingMachine;
    VendingMachineState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public abstract void insertCoin(Coin coin);
    public abstract void selectItem(String itemCode);
    public abstract void dispense();
    public abstract void refund();
}
