package CodeBase.TurnBasedAIGame.Player;

import java.util.Scanner;

public class RealPlayer implements Player {
    public final String name ;
    public final String charecter;
    public RealPlayer(String name, String charecter) {
        this.name = name;
        this.charecter = charecter;
    }
    @Override
    public Move move() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new Move(row, col ,charecter);

    }
    public String getName() {
        return name;
    }
    public String getPlayerCharecter() {
        return charecter;
    }
    
}
