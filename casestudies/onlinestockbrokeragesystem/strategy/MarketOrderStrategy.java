package casestudies.onlinestockbrokeragesystem.strategy;


import casestudies.onlinestockbrokeragesystem.entities.Order;

public class MarketOrderStrategy implements ExecutionStrategy {
    @Override
    public boolean canExecute(Order order, double marketPrice) {
        return true; // Market orders can always execute
    }
}