package Tester.TurnBasedAIGameTester;

import java.util.ArrayList;
import java.util.List;

import CodeBase.Logger.FileLogSink;
import CodeBase.Logger.LogSink;
import CodeBase.Logger.ChainOfResponsibility.DebugLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.ErrorLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.InfoLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.LogProcesser;
import CodeBase.TurnBasedAIGame.Boards.Board;
import CodeBase.TurnBasedAIGame.Boards.TicTacToe;
import CodeBase.TurnBasedAIGame.Game.Game;
import CodeBase.TurnBasedAIGame.Game.GameResult;
import CodeBase.TurnBasedAIGame.Player.Player;
import CodeBase.TurnBasedAIGame.Player.RealPlayer;

public class TurnBasedAIGameTester {
    public static void main(String args[])
    {
        LogSink logSink = new FileLogSink("Logger/TurnBasedAiGameLogger.txt");
        ErrorLogProcesser errorLogProcesser = new ErrorLogProcesser(null, logSink);
        DebugLogProcesser debugLogProcesser = new DebugLogProcesser(errorLogProcesser, logSink);
        LogProcesser logProcesser = new InfoLogProcesser(debugLogProcesser, logSink);
        Board board = new TicTacToe(3, 3);
        List<Player> players = new ArrayList<>();
        players.add(new RealPlayer("sudhakar","X"));
        players.add(new RealPlayer("lekha","O"));
        Game game = new Game(board, players,logProcesser);
        board.prepareBoard();
        board.printBoard();
        GameResult gameResult =game.startGame();
        gameResult.printWinnername();

    }
}