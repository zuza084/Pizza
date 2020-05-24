package pizza_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //fxmloader -> zaladowanie pliku
        Parent root = FXMLLoader.load(getClass().getResource("/view/pizzaView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Pizza");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
