package casestudies.tictactoe.strategy;

import casestudies.tictactoe.coreentities.Board;
import casestudies.tictactoe.enums.Symbol;

public class DiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, int row, int col, Symbol symbol) {
        int size = board.getSize();

        boolean mainDiagonal = true;
        for(int i = 0; i < size; i++){
            if(board.getCell(i,i).getSymbol() != symbol){
                mainDiagonal = false;
                break;
            }
        }
        if(mainDiagonal){
            return true;
        }

        for(int i = 0; i<size; i++){
            if(board.getCell(i, size-1-i).getSymbol() != symbol){
                return false;
            }
        }
       return true;
    }
}
