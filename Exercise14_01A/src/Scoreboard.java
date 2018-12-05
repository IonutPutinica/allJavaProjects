import java.util.Observer;
import java.util.Observable;
import java.util.Observable;
import java.util.Observable;

public class Scoreboard implements Observer
{
   private FootballGame game;

   public Scoreboard(FootballGame game)
   {
      this.game = game;
      showScore();
      game.addObserver(this);
   }

   public void showScore()
   {
      System.out.println("SCOREBOARD: " + game.getScore());
   }

   @Override
   public void update(Observable game, Object arg)
   {
      System.out.println(arg);

   }
}
