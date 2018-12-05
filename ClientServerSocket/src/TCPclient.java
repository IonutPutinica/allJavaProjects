import java.io.*;
import java.net.*;
import java.util.*;

public class TCPclient
{

   private static InetAddress host;
   private static final int PORT = 3456;

   public static void main(String[] args)
   {
      try
      {
         host = InetAddress.getLocalHost();
      }
      catch (UnknownHostException uhe)
      {
         System.out.println("Unable to find the Host IP!");
         System.exit(1);
      }
      accessServer();
   }

   private static void accessServer()
   {
      Socket clientSocket = null;
      try
      {
         // Step 1: create client socket and establish a connection to the
         // server
         clientSocket = new Socket(host, PORT);

         // Step 2: Setup input and output streams
         DataInputStream inFromServer = new DataInputStream(
               clientSocket.getInputStream());
         DataOutputStream outToServer = new DataOutputStream(
               clientSocket.getOutputStream());

         // create keyboard input stream
         Scanner userInput = new Scanner(System.in);
         String msg, resp;

         do
         {
            // read line from user input
            System.out
                  .println("Enter a message or (enter \"Exit\" to close): ");
            msg = userInput.nextLine();

            // Step 3: Send and receive data
            outToServer.writeUTF(msg);
            resp = inFromServer.readUTF();
            System.out.println("\nFROM SERVER> " + resp);
         }
         while (!msg.equals("Exit"));
      }
      catch (IOException ioe)
      {
      }
      catch (NoSuchElementException nse)
      {
      }
      finally
      {
         try
         {
            System.out.println("\n Closing the connection to the server!");

            // Step 4: Close the connection
            clientSocket.close();
         }
         catch (IOException ioe)
         {
            System.out.println("Unable to close te connection t o the server!");
            System.exit(1);
         }

      }

   }
}