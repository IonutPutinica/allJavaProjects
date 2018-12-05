package utility.collection;

import java.io.*;
import java.net.*;

public class TaskListCommunicationThreadHandler implements Runnable
{
   private DataInputStream in;
   private DataOutputStream out;
   private Socket socket;
   private String ip;

   public void TaskListCommunicationHandler()
   {
      in = new DataInputStream();
      out = new DataOutputStream();
      socket = new Socket();
      ip = new String();
   }

   @Override
   public void run()
   {

   }

}