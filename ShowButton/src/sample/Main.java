package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("EventHandler.java"));
        Text text = new Text();

        primaryStage.setTitle("Head Line");

        //set font of scene
        text.setFont(Font.font(45));

        //set the alignment
        text.setX(150);
        text.setY(150);

        //Set the text to be added
        text.setText("Hello World !");
        Label label = new Label("Button");
        Button button = new Button("Show");

        button.setOnAction(value ->  {
            label.setText("Hide");
        });



        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
