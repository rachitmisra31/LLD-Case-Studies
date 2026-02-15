package casestudies.vendingmachine.state;

import casestudies.vendingmachine.VendingMachine;
import casestudies.vendingmachine.enums.Coin;

class DispensingState extends VendingMachineState {
    public DispensingState(VendingMachine machine) {
        super(machine);
    }

    private VendingMachine machine;
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void selectItem(String code) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void dispense() {
        // already triggered by HasMoneyState
    }

    @Override
    public void refund() {
        System.out.println("Dispensing in progress. Refund not allowed.");
    }
}