package clases;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("programa.fxml"));
        primaryStage.setTitle("Fábrica de Paris | OcielRecord's");
        primaryStage.setScene(new Scene(root, 1000, 500));
        //primaryStage.setMaximized(true);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}