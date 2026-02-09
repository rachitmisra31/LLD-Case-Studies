package casestudies.tictactoe.observer;

import casestudies.tictactoe.coreentities.Game;

public interface GameObserver {
    void update(Game game);
}