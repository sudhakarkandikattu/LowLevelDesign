package CodeBase.TurnBasedAIGame.Game;

import java.util.List;

import CodeBase.TurnBasedAIGame.Boards.Board;
import CodeBase.TurnBasedAIGame.Player.Player;

public class Game {
    private final Board board ;
    private final List<Player> players;
    public Game(Board board,List<Player> players)
    {
        this.board = board;
        this.players= players;
    }
    public GameResult startGame()
    {
        int winnerId = 0;
        return new GameResult(winnerId);
    }
}
