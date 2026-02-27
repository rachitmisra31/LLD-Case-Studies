package casestudies.onlinestockbrokeragesystem.observer;

import casestudies.onlinestockbrokeragesystem.entities.Stock;

public interface StockObserver {
    void update(Stock stock);
}