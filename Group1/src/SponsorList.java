import java.util.ArrayList;
public class SponsorList
{
   private ArrayList<Sponsor> sponsors;
   
   public SponsorList() {
      sponsors = new ArrayList<Sponsor>();
   }
   
   public void addSponsor(Sponsor sponsor) {
      sponsors.add(sponsor);
   }
   public Sponsor[] getSponsors() {
      Sponsor[] sp = new Sponsor[sponsors.size()];
      for(int i = 0; i < sponsors.size(); i++) {
         sp[i] = sponsors.get(i);
      }
      return sp;
   }
   public void removeSponsor(Sponsor sponsor) {
      for(int i = 0; i < sponsors.size(); i++) {
         if(sponsor.equals(sponsors.get(i))) {
            sponsors.remove(i);
         }
      }
   }
}