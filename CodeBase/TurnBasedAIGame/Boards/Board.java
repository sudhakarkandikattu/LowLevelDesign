package CodeBase.TurnBasedAIGame.Boards;

import CodeBase.TurnBasedAIGame.Player.Move;

/**
 * Board
 */
public interface Board {

    void prepareBoard();
    void printBoard();
    boolean isGameCompleted();
    boolean isGameDraw();
    boolean applyMove(Move move);
    
}