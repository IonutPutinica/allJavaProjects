import java.util.Optional;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SimpleGUI extends GridPane
{

   private GridPane mainPane;
   private GridPane leftPane;
   private GridPane rightPane;

   private Label lbl0TextSample;

   private Button btn0Example;
   private Button btn1Example;

   private TextField txtfld0Example;
   private TextArea tar0Example;
   
   private VBox vb1Left;
   private VBox vb2Right;

   public SimpleGUI()
   {
      
      mainPane = new GridPane();
      leftPane = new GridPane();
      rightPane = new GridPane();
      
      lbl0TextSample = new Label("Select operation to perform:");
      
      btn0Example = new Button("Get candy");
      // EventHandler //
      btn0Example.setOnAction((event) -> {
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Getting candy");
         alert.setHeaderText("Confirm that you want candy");
         alert.setContentText("Are you sure you want candy boi?");
         alert.showAndWait();
         Optional<ButtonType> result = alert.showAndWait();
         if (result.get() == ButtonType.OK){
             txtfld0Example.setText("CANDYYY <3");
         } else {
             txtfld0Example = new TextField("NO CANDY :(");
         }
     });
      
      btn1Example = new Button("Give candy");
      
      btn1Example.setOnAction((event) -> {
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Giving candy");
         alert.setHeaderText("Confirm that you want to give candy");
         alert.setContentText("Are you sure you want to GIVE YOUR candy boi?");
         alert.showAndWait();
     });
      
      txtfld0Example = new TextField("Predefined text");
      tar0Example = new TextArea("Concrete text example");
      
      vb1Left = new VBox();
      vb2Right = new VBox();
      
      vb1Left.getChildren().add(0, lbl0TextSample);
      vb1Left.getChildren().add(1, btn0Example);
      vb1Left.getChildren().add(2, btn1Example);
      
      vb2Right.getChildren().add(0, txtfld0Example);
      vb2Right.getChildren().add(1, tar0Example);
      
      leftPane.getChildren().add(vb1Left);
      rightPane.getChildren().add(vb2Right);
      
      mainPane.add(leftPane, 0, 0);
      mainPane.add(rightPane, 1, 0);
      
      
   }
   public Scene returnPane() {
      Scene mainPP = new Scene(mainPane);
      return mainPP;
   }
}
