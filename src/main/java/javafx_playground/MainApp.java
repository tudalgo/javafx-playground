package javafx_playground;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

/**
 * The MainApp class is the main class of the JavaFX application.
 */
public class MainApp extends Application {

    @Override
    public void start(final Stage stage) {
        final BorderPane root = new BorderPane();
        // Create a Scene object with the root node of the layout.
        final Scene scene = new Scene(root);

        // -Title-
        // Get the Java version and JavaFX version.
        final String javaVersion = System.getProperty("java.version");
        final String javafxVersion = System.getProperty("javafx.version");
        // change the text of the label.
        final Label label = new Label();
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        // center the label.
        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        root.setTop(label);

        //-Button-
        // Add a button to the scene.
        final Button button = new Button("Click me to change font color!");
        // Add an action to the button.
        button.setOnAction(event -> {
            // change the color of the label to a random color.
            label.setTextFill(javafx.scene.paint.Color.color(Math.random(), Math.random(), Math.random()));
        });
        // also change the color of the button text to match the color of the label.
        button.textFillProperty().bind(label.textFillProperty());
        // make it fit the scene.
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        // add the button to the center of the root node.
        root.setCenter(button);
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
