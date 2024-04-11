package CodeBase.TurnBasedAIGame.Game;

import java.util.List;

import CodeBase.Logger.ConsoleLogSink;
import CodeBase.Logger.ChainOfResponsibility.LogProcesser;
import CodeBase.TurnBasedAIGame.Boards.Board;
import CodeBase.TurnBasedAIGame.Player.Move;
import CodeBase.TurnBasedAIGame.Player.Player;

public class Game {
    private final Board board ;
    private final List<Player> players;
    private final LogProcesser logProcesser;
    public Game(Board board,List<Player> players,LogProcesser logProcesser)
    {
        this.board = board;
        this.players= players;
        this.logProcesser = logProcesser;
    }
    public GameResult startGame()
    {
        int playeridx =0;
        while(true)
        {
            Player currenPlayer = players.get(playeridx);
            Move move =currenPlayer.move();
            boolean validMove = board.applyMove(move);
            if(!validMove) continue;
            logProcesser.log(LogProcesser.INFO,currenPlayer.getName() + " placed " + currenPlayer.getPlayerCharecter() + " At " + move.getRow() + " " + move.getCol());
            if(board.isGameCompleted())
            {
                return new GameResult(currenPlayer.getName());
            }
            if(board.isGameDraw())
            {
                return new GameResult("no one");
            }
            playeridx++;
            if(playeridx==players.size()) playeridx =0;
            board.printBoard();
        }
    }
}
