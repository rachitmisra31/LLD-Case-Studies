package casestudies.tictactoe.enums;

public enum Symbol {

   X('X'),
    O('O'),
    EMPTY('_');

   private char displayChar;

   Symbol(char displayChar) {
      this.displayChar = displayChar;
   }

   private char getDisplayChar() {
       return displayChar;
   }

}
