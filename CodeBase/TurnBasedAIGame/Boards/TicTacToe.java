package CodeBase.TurnBasedAIGame.Boards;

public class TicTacToe implements Board {
    private final String[][] board ;
    private final int rowSize;
    private final int colSize;
    private static final String defaultChar = "." ;
    public TicTacToe (int rowSize ,int colSize)
    {
        this.rowSize = rowSize;
        this.colSize = colSize;
        board = new String[rowSize][colSize];
    }
    @Override
    public void prepareBoard() {
       for(int i=0;i<rowSize;i++)
       {
            for(int j=0;j<colSize;j++)
            {
                board[i][j]=defaultChar;
            }
       }
    }
    @Override
    public void printBoard() {
       for(int i=0;i<rowSize;i++)
       {
            for(int j=0;j<colSize;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
       }
    }
}
