import java.util.Observable;

public class FootballGame extends Observable
{
   private String homeTeam;
   private String awayTeam;
   private int homeTeamGoal;
   private int awayTeamGoal;

   public FootballGame(String homeTeam, String awayTeam)
   {
      this.homeTeam = homeTeam;
      this.awayTeam = awayTeam;
      homeTeamGoal = 0;
      awayTeamGoal = 0;
   }

   public String getHomeTeam()
   {
      return homeTeam;
   }

   public String getAwayTeam()
   {
      return awayTeam;
   }

   public void scoreGoal(String team)
   {
      if (team.equals(homeTeam))
      {
         homeTeamGoal++;
      }
      else if (team.equals(awayTeam))
      {
         awayTeamGoal++;
      }
   }

   public String getScore()
   {
      return homeTeamGoal + " - " + awayTeamGoal;
   }
}