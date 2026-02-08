package casestudies.tictactoe.strategy;

import casestudies.tictactoe.coreentities.Board;
import casestudies.tictactoe.enums.Symbol;
import casestudies.tictactoe.exception.InvalidMoveException;

public interface WinningStrategy {

    boolean checkWin(Board board, int row, int col, Symbol symbol);
}
