package Tester.TurnBasedAIGameTester;

import java.util.ArrayList;
import java.util.List;

import CodeBase.TurnBasedAIGame.Boards.Board;
import CodeBase.TurnBasedAIGame.Boards.TicTacToe;
import CodeBase.TurnBasedAIGame.Game.Game;
import CodeBase.TurnBasedAIGame.Player.Player;
import CodeBase.TurnBasedAIGame.Player.RealPlayer;

public class TurnBasedAIGameTester {
    public static void main(String args[])
    {
        Board board = new TicTacToe(3, 3);
        List<Player> players = new ArrayList<>();
        players.add(new RealPlayer());
        players.add(new RealPlayer());
        Game game = new Game(board, players);
        board.prepareBoard();
        board.printBoard();
    }
}