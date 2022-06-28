package javafx_playground;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

/**
 * The MainApp class is the main class of the JavaFX application.
 */
public class MainApp extends Application {

    @Override
    public void start(final Stage stage) throws Exception {
        // Load the FXML layout from the file scene.fxml.
        final @Nullable URL sceneConfig = getClass().getResource("scene.fxml");
        if (sceneConfig == null) {
            throw new IllegalStateException("Could not find scene.fxml");
        }
        final Parent root = FXMLLoader.load(sceneConfig);

        // Create a Scene object with the root node of the layout.
        final Scene scene = new Scene(root);
        // Add the stylesheet to the scene.
        final @Nullable URL styles = getClass().getResource("styles.css");
        if (styles == null) {
            throw new IllegalStateException("Could not find styles.css");
        }
        scene.getStylesheets().add(styles.toExternalForm());

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
