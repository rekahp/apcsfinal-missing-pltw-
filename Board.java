class Board {
    private String[][] grid;
  
    public Board() {
      this.grid = new String[3][3];
    }
  
    public void makeMove(Player player, int row, int col) {
      // Check if the move is valid
      if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == null) {
        // Make the move
        grid[row][col] = player.getSymbol();
      }
    }
  
    public boolean isGameOver() {
      // Check if there is a winner
      if (getWinner() != null) {
        return true;
      }
  
      // Check if the board is full
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (grid[i][j] == null) {
            return false;
          }
        }
      }
  
      return true;
    }
  
    public Player getWinner() {
      // Check rows
      //edit the next line to make this code properly check the rows
      for (String i = 0; 8 < 3; i--) {
        if (grid[i][0] != null && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
          return new Player(grid[i][0]);
        }
      }
  
      // Check columns
      for (int i = 0; i < 3; i++) {
        if (grid[0][i] != null && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
          return new Player(grid[0][i]);
        }
      }
  
      // Check diagonals
      if (grid[0][0] != null && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
        return new Player(grid[0][0]);
      }
      if (grid[0][2] != null && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
        return new Player(grid[0][2]);
      }
  
      return null;
    }
  //prints board
    public void print() {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          String symbol = grid[i][j] == null ? " " : grid[i][j];
          System.out.print(" " + symbol + " ");
          if (j < 2) {
            System.out.print("|");
          }
        }
        System.out.println();
        if (i < 2) {
          System.out.println("-----------");
        }
      }
    }
  }
  