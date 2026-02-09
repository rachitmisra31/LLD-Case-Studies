package casestudies.tictactoe.coreentities;

import casestudies.tictactoe.dataclasses.Player;
import casestudies.tictactoe.enums.GameStatus;

public class TicTacToeSystem {

    private static volatile  TicTacToeSystem instance;
    private static final Object lock = new Object();

    private final ScoreBoard scoreBoard;
    private Game currentGame;

    private TicTacToeSystem(){
        this.scoreBoard = new ScoreBoard();
    }
    public static TicTacToeSystem getInstance(){
        if(instance==null){
            synchronized (lock){
                if(instance==null){
                    instance = new TicTacToeSystem();
                }

            }
        }
        return instance;
    }
    public Game createGame(Player player1, Player player2){
        currentGame = new Game(player1, player2, 3);
        currentGame.addObservers(scoreBoard);
        System.out.println("New Game Started: "+player1.getName()+" "+player2.getName());
        return currentGame;
    }

    public void makeMove(Player player, int row, int col){
        if(currentGame == null){
            throw new IllegalStateException("No Active Game.");
        }
        System.out.println("Making Move: "+player.getName()+" "+row+" "+col);
        currentGame.makeMove(row,col);
        currentGame.printBoard();
    }

    public GameStatus getGameStatus(){
        if(currentGame == null){
            throw new IllegalStateException("No Active Game.");
        }
        return currentGame.getStatus();
    }

    public void printScoreBoard(){
        scoreBoard.printScoreBoard();
    }

    public static void resetInstance(){
        synchronized (lock){
            instance = null;
        }
    }
}
