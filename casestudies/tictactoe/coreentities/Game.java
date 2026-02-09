package casestudies.tictactoe.coreentities;

import casestudies.tictactoe.dataclasses.Player;
import casestudies.tictactoe.enums.GameStatus;
import casestudies.tictactoe.enums.Symbol;
import casestudies.tictactoe.exception.InvalidMoveException;
import casestudies.tictactoe.observer.GameObserver;
import casestudies.tictactoe.strategy.ColumnWinningStrategy;
import casestudies.tictactoe.strategy.DiagonalWinningStrategy;
import casestudies.tictactoe.strategy.RowWinningStrategy;
import casestudies.tictactoe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Game {

    private final Board board;
    private int currentPlayerIndex;
    private GameStatus status;
    private final List<WinningStrategy> winningStrategies;
    private final Player[] players;
    private final List<GameObserver> observers;

    public Game(Player player1, Player player2, int boardSize) {
        this.board = new Board(boardSize);
        this.players = new Player[]{player1, player2};
        this.observers = new CopyOnWriteArrayList<>();
        this.winningStrategies = initializeWinningStrategies();
        this.currentPlayerIndex = 0;
        this.status = GameStatus.IN_PROGRESS;
    }

    private List<WinningStrategy> initializeWinningStrategies() {
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        return winningStrategies;
    }

    public synchronized void makeMove(int row, int column) {
        if(status != GameStatus.IN_PROGRESS){
            throw new InvalidMoveException("Game is already over");
        }
        if(!board.isCellEmpty(row, column)){
            throw new InvalidMoveException(row + "and " + column+" is occupied");
        }

        Player currentPlayer = players[currentPlayerIndex];
        board.placeSymbol(row, column, currentPlayer.getSymbol());

        if(checlWin(row, column, currentPlayer.getSymbol())){
           status = (currentPlayer.getSymbol() == Symbol.X)
                   ? GameStatus.WINNER_X
                   : GameStatus.WINNER_O;
           notifyObservers();
           return;
        }
        if(board.isFull()){
            status = GameStatus.DRAW;
            notifyObservers();
            return;
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }

    private boolean checlWin(int row, int column, Symbol symbol){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWin(board, row, column, symbol)){
                return true;
            }
        }
        return false;
    }

    public void addObservers(GameObserver observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(GameObserver observer : observers){
            observer.update(this);
        }
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public GameStatus getStatus() {
        return status;
    }

    public Player getWinner() {
        if(status == GameStatus.WINNER_X){
            return players[0].getSymbol() == Symbol.X ? players[0]: players[1];
        }
        else if(status == GameStatus.WINNER_O){
            return players[0].getSymbol() == Symbol.O ? players[0]: players[1];
        }
        return null;
    }

    public void printBoard(){
        board.printBoard();
    }
}