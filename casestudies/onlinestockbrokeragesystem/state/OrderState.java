package casestudies.onlinestockbrokeragesystem.state;

import casestudies.onlinestockbrokeragesystem.entities.Order;

public interface OrderState {
    void handle(Order order);
    void cancel(Order order);
}