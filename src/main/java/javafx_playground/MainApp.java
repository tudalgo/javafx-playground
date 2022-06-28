package javafx_playground;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The MainApp class is the main class of the JavaFX application.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML layout from the file scene.fxml.
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        // Create a Scene object with the root node of the layout.
        Scene scene = new Scene(root);
        // Add the stylesheet to the scene.
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the title of the stage.
        stage.setTitle("JavaFX and Gradle");
        // Set the scene to the stage.
        stage.setScene(scene);
        // Show the stage.
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
