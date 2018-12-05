package chat.controller;

import java.util.Observable;

import chat.domain.mediator.ChatModel;
import chat.domain.model.ChatMessage;
import chat.view.ChatView;

public class ChatController
{
   private ChatModel model;
   private ChatView view;

   public ChatController(ChatModel model, ChatView view)
   {
      this.model = model;
      this.view = view;
      Observable obs = (Observable) model;
      obs.addObserver(view);
   }

   public void execute(String what)
   {
      switch (what)
      {
         case "Send":
            String input = view.getInput();
            if (input.length() > 0)
            {
               ChatMessage message = new ChatMessage(input);
               model.addMessage(message);
            
            }
            break;
         case "Quit":
            System.exit(0);
      }
   }

}