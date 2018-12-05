public class TestFootballGame
{
   public static void main(String[] args)
   {
      FootballGame game = new FootballGame("Italy", "Portugal");
      System.out.println("Football game between " + game.getHomeTeam() + " and "
            + game.getAwayTeam() + ":");
      Scoreboard scoreboard = new Scoreboard(game);

      FootballFan[] fans = new FootballFan[10];
      for (int i = 0; i < fans.length * 2 / 3; i++)
      {
         fans[i] = new FootballFan(game, true);
      }
      for (int i = fans.length * 2 / 3; i < fans.length; i++)
      {
         fans[i] = new FootballFan(game, false);
      }

      play();
      goalChance(game);
      play();
      goalChance(game);
      play();
      goalChance(game);
      play();
      goalChance(game);
      System.out.println("Game ended");
   }

   private static void play()
   {
      try
      {
         Thread.sleep(5000);
      }
      catch (InterruptedException e)
      {
         // nothing
      }
   }

   private static void goalChance(FootballGame game)
   {
      String team = null;
      if ((int) (Math.random() * 2) == 0)
      {
         team = game.getHomeTeam();
      }
      else
      {
         team = game.getAwayTeam();
      }
      if ((int) (Math.random() * 4) > 0) // 75% chance
      {
         game.scoreGoal(team);
         System.out.println(
               team + " scored a goal. Score is now: " + game.getScore());
      }
      else
      {
         System.out.println(team + " missed the chance");
      }
   }
}