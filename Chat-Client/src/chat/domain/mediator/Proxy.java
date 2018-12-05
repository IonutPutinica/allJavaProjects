package chat.domain.mediator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;

import chat.domain.model.ChatMessage;

public class Proxy implements ChatModel
{
   private DataInputStream in;
   private DataOutputStream out;
   private Socket socket;
   private ChatModel model;

   public Proxy(ChatModel model, String host, int port)
         throws UnknownHostException, IOException
   {
      this.model = model;
      // create client socket, connect to server.
      socket = new Socket(host, port);
      System.out.println("Connected to server: " + host + " at port " + port);

      // create input stream attached to the socket.
      in = new DataInputStream(socket.getInputStream());

      // create output stream attached to the socket.
      out = new DataOutputStream(socket.getOutputStream());
      ReceiverThreadHandler receiver = new ReceiverThreadHandler(model, in);
      Thread receiverThread = new Thread(receiver);
      receiverThread.start();
   }

   @Override
   public void addMessage(ChatMessage message)
   {
      try
      {
         Gson gson = new Gson();
         String json = gson.toJson(message);
         out.writeUTF(json);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }
}
