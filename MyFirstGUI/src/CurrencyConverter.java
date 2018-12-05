import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class CurrencyConverter extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {
      // for centering
      GridPane root = new GridPane();
      root.setAlignment(Pos.CENTER);
      root.setHgap(30);

      Label header = new Label("Convert DKK to EURO");
      header.setFont(Font.font(35));
      header.setMinWidth(350);
      header.setAlignment(Pos.CENTER);
      Label conversionRate = new Label("Exchange rate: 750");
      conversionRate.setMinWidth(350);
      conversionRate.setAlignment(Pos.CENTER);

      root.add(header, 0, 0);
      root.add(conversionRate, 0, 1);

      VBox textFields = new VBox();
      textFields.setSpacing(10);
      TextField textField1 = new TextField();
      textField1.setPromptText("Amount of DKK");

      TextField textField2 = new TextField();
      textField2.setEditable(false);

      textFields.setMinWidth(100);
      textFields.getChildren().addAll(textField1, textField2);

      VBox buttons = new VBox();
      buttons.setMinWidth(100);
      buttons.setAlignment(Pos.CENTER_RIGHT);
      Button button = new Button("Calculate");
      buttons.setPadding(new Insets(10, 0, 0, 0));
      buttons.getChildren().add(button);

      root.add(textFields, 1, 1);
      root.add(buttons, 1, 2);

      Scene scene = new Scene(root, 600, 300);
      primaryStage.setScene(scene);

      primaryStage.show();
   }

   public static void main(String... args) {
      launch(args);
   }

}