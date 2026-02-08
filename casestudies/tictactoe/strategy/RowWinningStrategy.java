package casestudies.tictactoe.strategy;

import casestudies.tictactoe.coreentities.Board;
import casestudies.tictactoe.enums.Symbol;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, int row, int col, Symbol symbol) {
        int size = board.getSize();
        for(int i = 0; i< size; i++){
            if(board.getCell(row,i).getSymbol() != symbol){
                return false;
            }
        }
        return true;
    }
}

/**
 *
 */
