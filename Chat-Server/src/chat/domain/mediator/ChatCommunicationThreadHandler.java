package chat.domain.mediator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

import com.google.gson.Gson;

import chat.domain.model.ChatMessage;

public class ChatCommunicationThreadHandler implements Runnable, Observer
{
   private DataInputStream in;
   private DataOutputStream out;
   private Socket socket;
   private String ip;
   private ChatModel model;

   public ChatCommunicationThreadHandler(Socket socket,
         ChatModel model)
   {
      this.model = model;
      Observable obs=(Observable) model;
      obs.addObserver(this);
      try
      {
         this.socket = socket;
         in = new DataInputStream(socket.getInputStream());
         out = new DataOutputStream(socket.getOutputStream());
         this.ip = socket.getInetAddress().getHostAddress();
         System.out.println(ip + " connected");
      }
      catch (IOException e)
      {
         System.out.println(
               "Error for client connection. Message: " + e.getMessage());
      }
   }

   @Override
   public void run()
   {
      boolean continueCommuticating = true;
      try
      {
         while (continueCommuticating)
         {
            String line = in.readUTF();
            System.out.println(ip + "> " + line);

            // convert from JSon
            Gson gson = new Gson();
            ChatMessage message = gson.fromJson(line, ChatMessage.class);
            System.out.println("Message: " + message);
            model.addMessage(message);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

  
   @Override
   public void update(Observable arg0, Object arg1)
   {
      try
      {
         Gson gson = new Gson();
         String json = gson.toJson((ChatMessage)arg1);
         out.writeUTF(json);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }
}
