package casestudies.tictactoe.enums;

/**
 * This Enum takes care of the tictactoe's current status
 * and checks whether symbol x is a winner, O is a winner
 * or it is a draw.
 */
public enum GameStatus {

    IN_PROGRESS,
    WINNER_X,
    WINNER_O,
    DRAW,
}