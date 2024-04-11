package CodeBase.TurnBasedAIGame.Game;

public class GameResult {
    private final String name;
    public GameResult(String name) {
        this.name = name;
    }
    public void printWinnername()
    {
        System.out.println(name+" has won");
    }
}
