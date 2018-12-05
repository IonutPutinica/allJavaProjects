import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Main extends Application {
      
   SimpleGUI childAccess = new SimpleGUI();
   
   @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello World");
        label.setAlignment(Pos.CENTER);
        primaryStage.setScene(childAccess.returnPane());
        primaryStage.setTitle("Hello World Application");
        primaryStage.show();
    }
   
   public static void main(String[] args) {
      Application.launch(args);
  }
}