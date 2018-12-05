package chat.domain.mediator;

import java.io.DataInputStream;
import java.io.IOException;

import com.google.gson.Gson;

import chat.domain.model.ChatMessage;

public class ReceiverThreadHandler implements Runnable
{
   private ChatModel model;
   private DataInputStream in;

   public ReceiverThreadHandler(ChatModel model, DataInputStream in)
   {
      this.model = model;
      this.in = in;
   }

   @Override
   public void run()
   {
      while (true)
      {
        
         try
         {
           String line = in.readUTF();
           // convert from JSon
           Gson gson = new Gson();
           ChatMessage message = gson.fromJson(line, ChatMessage.class);
           
           message.setId("BROADCAST");
           model.addMessage(message);
         }
         catch (IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

      
      }
   }

}
