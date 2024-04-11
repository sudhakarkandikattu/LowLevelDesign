package CodeBase.TurnBasedAIGame.Boards;

import CodeBase.TurnBasedAIGame.Player.Move;

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
    public boolean isGameCompleted()
    {
        boolean isRowEqual = isRowEqual();
        boolean isColumnEqual = isColumnEqual();
        boolean isDiagonalEqual = isDiagonalEqual();
        return isRowEqual || isColumnEqual || isDiagonalEqual ;
    }
    private boolean isDiagonalEqual() {
        boolean diagonal1 = false;
        boolean diagonal2 = false;
        int row=1;
        int col=1;
        while(row<rowSize && col<colSize)
        {
            if(board[row][col] != board[row-1][col-1] || board[row][col]==defaultChar) 
            {
                break;
            }
            row++;
            col++;
        }
        if(row==rowSize && col == colSize) diagonal1 = true;
        row=1;
        col=colSize-2;
        while(row<rowSize && col>=0)
        {
            if(board[row][col] != board[row-1][col+1] || board[row][col]==defaultChar) 
            {
                break;
            }
            row++;
            col--;
        }
        if(row==rowSize && col < 0) diagonal2 = true;
        return diagonal1 || diagonal2;
    }
    private boolean isColumnEqual() {
       for(int i=0;i<colSize;i++)
       {
            int j;
            for(j=1;j<rowSize;j++)
            {
                if(board[j][i]!=board[j-1][i] || board[j][i]==defaultChar) break;
            }
            if(j==rowSize) return true;
       }
       return  false;
    }
    private boolean isRowEqual() {
        for(int i=0;i<rowSize;i++)
       {
            int j;
            for(j=1;j<colSize;j++)
            {
                if(board[i][j]!=board[i][j-1] || board[i][j]==defaultChar) break;
            }
            if(j==colSize) return true;
       } 
       return false;
    }
    @Override
    public boolean isGameDraw() {
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                if(board[i][j]==defaultChar) return false;
            }
        }
        return true;
    }
    @Override
    public boolean applyMove(Move move) {
        // TODO Auto-generated method stub
        int row=move.getRow();
        int col=move.getCol();
        if(row<0 || row>=rowSize || col<0 || col >=colSize)
        {
            System.out.println("please enter valid move");
            return false;
        }
        board[row][col] = move.getCharecter();
        return true;
    }

}
