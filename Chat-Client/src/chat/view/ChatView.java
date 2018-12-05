package chat.view;

import java.util.Observer;

import chat.controller.ChatController;

public interface ChatView extends Observer
{
   public void start(ChatController controller);
   public String getInput();
   public void showOutput(String text);
}
