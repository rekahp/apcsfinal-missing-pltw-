import java.util.Scanner;

class Player {
  private String symbol;

  public Player(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
//get the row
  public int getRow(Board board) {
    Scanner scanner = new Scanner(System.in);
    int row = -1;
    //create a while loop that ensures that the number entered is a number that can be put into the board
    //then create a print statement asking for which row the player wants to enter and a scanner to get the row number
//make edits here
    return row;
  }
//get the column
  public int getColumn(Board board) {
    Scanner scanner = new Scanner(System.in);
    int col = -1;
    //create a while loop that ensures that the number entered is a number that can be put into the board
    //then create a print statement asking for which column the player wants to enter and a scanner to get the column number
//make edits here
    return col;
  }
}
