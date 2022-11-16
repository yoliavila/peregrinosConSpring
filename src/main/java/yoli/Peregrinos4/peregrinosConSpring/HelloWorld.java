package yoli.Peregrinos4.peregrinosConSpring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            HBox layout = (HBox) FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
            stage.setTitle("¡Hola JavaFX!");
            stage.setScene(new Scene(layout, 300, 250));
            stage.show();
        } catch (IOException e)
        {e.printStackTrace();
        }
    }
}
