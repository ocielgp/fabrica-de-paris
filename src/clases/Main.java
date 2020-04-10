package clases;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Definir ventana principal
        Parent root = FXMLLoader.load(getClass().getResource("programa.fxml"));
        primaryStage.setTitle("Fábrica de Paris | OcielRecord's");
        //Cargar estilos
        //root.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        //Definir dimensiones de la ventana principal
        primaryStage.setScene(new Scene(root, 1000, 500));
        //Centrar ventana principal
        primaryStage.centerOnScreen();
        //Mostrar ventana principal
        primaryStage.show();
    }

    public void stop() {
        System.out.println("Programa terminado");
    }

    public static void main(String[] args) {
        launch(args);
    }
}