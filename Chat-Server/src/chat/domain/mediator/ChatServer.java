package chat.domain.mediator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer implements Runnable
{
   private ChatModel model;
   private ServerSocket welcomeSocket;

   public ChatServer(ChatModel model, int port) throws IOException
   {
      this.model = model;
      this.welcomeSocket = new ServerSocket(port);
      System.out.println("Starting Server at port " + port + "...");
   }

   @Override
   public void run()
   {
      while (true)
      {
         System.out.println("Waiting for a client...");
         try
         {
            Socket socket = welcomeSocket.accept();
            ChatCommunicationThreadHandler c;
            c = new ChatCommunicationThreadHandler(socket, model);
            Thread t = new Thread(c);
            t.start();
         }
         catch (IOException e)
         {
            System.out.println("Error in server. Message: " + e.getMessage());
         }
      }
   }
}
