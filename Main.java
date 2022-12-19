import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Create a board
    Board board = new Board();

    // Create players
    Player player1 = new Player("X");
    Player player2 = new Player("O");

    // Determine who goes first
    Player currentPlayer = Math.random() < 0.5 ? player1 : player2;

    // Loop until the game is over
    while (!board.isGameOver()) {
      // Prints the state of the board
      board.print();

      // Get the row and column from the current player
      int row = currentPlayer.getRow(board);
      int col = currentPlayer.getColumn(board);

      // Make the move
      board.makeMove(currentPlayer, row, col);

      // Switch players
      currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    // Print the final state of the board
    board.print();

    // Announce the winner
    Player winner = board.getWinner();
    if (winner != null) {
      System.out.println("The winner is: " + winner.getSymbol());
    } else {
      System.out.println("The game is a draw.");
    }
  }
}
