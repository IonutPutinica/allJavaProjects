import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import com.google.gson.Gson;

public class CommunicationThreadHandler implements Runnable
{

   private DataInputStream in;
   private DataOutputStream out;
   private Socket socket;
   private String ip;

   public CommunicationThreadHandler(Socket socket) throws IOException
   {
      this.socket = socket;

      // Create Input Stream attached to the socket.
      this.in = new DataInputStream(socket.getInputStream());

      // Create Output Stream attached to the socket.
      this.out = new DataOutputStream(socket.getOutputStream());
   }

   @Override
   public void run()
   {

      try
      {

         // Read line from client.
         String clientText = in.readUTF();
         System.out.println("Client >" + clientText);

         // Convert from JSON
         Gson gson = new Gson();
         ChatClient client = gson.fromJson(clientText, ChatClient.class);
         System.out.println("Client >" + client);

         // Creating reply
         Message reply = new Message("(Temp) " + "Welcome!");
         System.out.println("Reply: " + reply);

         // Convert reply to JSON
         gson = new Gson();
         String replyJson = gson.toJson(reply);

         // Send reply to client.
         System.out.println("Server > " + replyJson);
         out.writeUTF(replyJson);

      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
