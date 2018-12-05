import java.util.ArrayList;
public class EventList
{
   private ArrayList<Event> events;
   
   public EventList() {
      events = new ArrayList<Event>();
   }
   public void addEvent(Event event) {
      events.add(event);
   }
   public Event[] getEvents() {
      Event[] ev = new Event[events.size()];
      for(int i = 0; i < events.size(); i++) {
         ev[i] = events.get(i);
      }
      return ev;
   }
   public void removeEvent(Event event) {
      for(int i = 0; i < events.size();i++) {
         if(event.equals(events.get(i))) {
            events.remove(i);
         }
      }
   }
}
