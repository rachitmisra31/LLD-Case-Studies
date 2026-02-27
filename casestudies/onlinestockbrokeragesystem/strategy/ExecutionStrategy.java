package casestudies.onlinestockbrokeragesystem.strategy;

import casestudies.onlinestockbrokeragesystem.entities.Order;

public interface ExecutionStrategy {
    boolean canExecute(Order order, double marketPrice);
}