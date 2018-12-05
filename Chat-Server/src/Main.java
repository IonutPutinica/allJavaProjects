
import chat.controller.ChatController;
import chat.domain.mediator.ChatModel;
import chat.domain.mediator.ChatModelManager;
import chat.view.ChatGui;
import chat.view.ChatView;

public class Main
{
   public static void main(String args[])
   {
      try
      {
         ChatModel model = new ChatModelManager();
         ChatView view = new ChatGui();
         ChatController controller = new ChatController(model, view);

         view.start(controller);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
