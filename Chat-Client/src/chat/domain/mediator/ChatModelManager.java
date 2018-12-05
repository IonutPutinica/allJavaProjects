package chat.domain.mediator;
import java.io.IOException;
import java.util.Observable;

import chat.domain.model.ChatMessage;
public class ChatModelManager extends Observable implements ChatModel
{
   private Proxy proxy;
 
   public ChatModelManager() 
   {
     
      try
      {
         proxy=new Proxy(this, "localhost", 2910);
      }
      catch (IOException e)
      {
       
         e.printStackTrace();
      }
   }

   @Override
   public void addMessage(ChatMessage message)
   {
      if(message.getId().equals("BROADCAST"))
      {
      super.setChanged();
      super.notifyObservers(message);
      }
      else
      {
         proxy.addMessage(message);
      }
   }

}
