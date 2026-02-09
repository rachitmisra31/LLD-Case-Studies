package casestudies.tictactoe.dataclasses;

import casestudies.tictactoe.enums.Symbol;
import casestudies.tictactoe.exception.InvalidMoveException;

/**
 * This class will decide the name of the players
 * and there respective symbol and also it will throw the
 * illegalmoveexception for any invalid move.
 */
public class Player {

    private final String name;
    private final Symbol symbol;
    public Player(String name, Symbol symbol) {

        if(symbol == Symbol.EMPTY)
            throw new InvalidMoveException("Player has to make a move with O or X");
        this.name = name;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", symbol=" + symbol +
                '}';
    }
}
