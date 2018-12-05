import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

public class ChatClient
{

   private Scanner input;
   private BufferedReader in;
   private PrintWriter out;
   private Socket socket;

   private int port;
   private String host;

   public ChatClient(String host, int port)
   {

      input = new Scanner(System.in);
      this.port = port;
      this.host = host;

   }

   public void execute() throws IOException
   {

      String msgBody;
      Gson gson = new Gson();
      try
      {
         this.socket = new Socket(host, port);
         in = new BufferedReader(
               new InputStreamReader(socket.getInputStream()));
         out = new PrintWriter(socket.getOutputStream());
         do
         {
            System.out.println("Type your message:");
            msgBody = input.nextLine();
            Message msg = new Message(msgBody);
            out.println(gson.toJson(msg));
         }
         while (!msgBody.equals("EXIT"));

      }
      catch (IOException e)
      {
         System.out.println("Connection could not be established!");
         e.printStackTrace();

      }

   }

}