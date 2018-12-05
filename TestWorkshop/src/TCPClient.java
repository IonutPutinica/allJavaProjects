

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TCPClient {
   
   //private static InetAddress host;
   private static final int PORT = 3456;
   private static InetAddress barbara;
   
   public static void main(String[] args) {
      
      try {
        // host = InetAddress.getLocalHost();
         barbara = InetAddress.getByAddress(new byte[] {(byte)10, (byte)152, (byte)212, (byte)11});
      } catch (UnknownHostException uhe) {
         System.out.println("Unable to find the Host ID");
         System.exit(1);
      }
      accessServer();
   }
   
   private static void accessServer() {
      Socket clientSocket = null;
      try {
         clientSocket = new Socket(barbara, PORT);
         DataInputStream inFromServer = new DataInputStream(clientSocket.getInputStream());
         DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
         
         Scanner userInput = new Scanner(System.in);
         String msg, resp;
         
         do {
            System.out.println("Enter a message: ");
            msg = userInput.nextLine();
            outToServer.writeUTF(msg);
            resp = inFromServer.readUTF();
            System.out.println("From Server> " + resp);
         } while(!msg.equals("Exit"));
         
         userInput.close();
      } catch (IOException | NoSuchElementException e) {}
      finally {
         try{
            clientSocket.close();
            }catch(IOException ioe){ ioe.printStackTrace(); }}
   }
   
}