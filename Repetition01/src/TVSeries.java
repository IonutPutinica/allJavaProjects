import java.util.ArrayList;

public class TVSeries
{
   private String title;
   private int numberOfEpisodes;
   private ArrayList<Actor> actors;

   public TVSeries(String title)
   {
      this.title = title;
      numberOfEpisodes = 0;
      actors = new ArrayList<Actor>();

   }

   public void hireActor(Actor actor)
   {
      actors.add(actor);
   }

   public int getNumberOfActors()
   {
      return actors.size();
   }

   public Actor getActor(int index)
   {
      return actors.get(index);
   }

   public void awardEmmy(String name)
   {
      for (int i = 0; i < actors.size(); i++)
      {
         if (actors.get(i).getName().equals(name))
            actors.get(i).awardEmmy();
      }
   }

   public void makeNextEpisode()
   {
      numberOfEpisodes++;
      for (int i = 0; i < actors.size(); i++)
      {
         actors.get(i).participateInEpisode();
      }

   }

   public ArrayList<Actor> getEmmyWinners()
   {
      ArrayList<Actor> emmyWinners = new ArrayList<Actor>();
      for (int i = 0; i < actors.size(); i++)
         if (actors.get(i).getNumberOfEmmys() > 0)
            emmyWinners.add(actors.get(i));
      return emmyWinners;

   }

   public String toString()
   {
      return "Tv Series" + title + "has " + numberOfEpisodes + "episodes."
            + "\n" + actors;
   }
}