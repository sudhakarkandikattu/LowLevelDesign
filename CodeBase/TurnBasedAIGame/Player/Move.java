package CodeBase.TurnBasedAIGame.Player;

public class Move {
    private final int row ;
    private final int col;
    private final String charecter ;
    public Move(int row, int col,String charecter) {
        this.row = row;
        this.col = col;
        this.charecter = charecter;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public String getCharecter() {
        return charecter;
    }
    
}
