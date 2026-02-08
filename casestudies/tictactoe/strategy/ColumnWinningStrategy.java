package casestudies.tictactoe.strategy;

import casestudies.tictactoe.coreentities.Board;
import casestudies.tictactoe.enums.Symbol;

public class ColumnWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, int row, int col, Symbol symbol) {
        int size = board.getSize();
        for(int j = 0;j<size;j++){
            if(board.getCell(j,col).getSymbol() != symbol){
                return false;
            }
        }
        return true;
    }
}
