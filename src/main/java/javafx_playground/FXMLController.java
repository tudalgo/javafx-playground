package javafx_playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 */
public class FXMLController implements Initializable {

    // The @FXML annotation is used to mark a field or method as a control that is bound to a UI element.
    @FXML
    private Label label;

    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        // Get the Java version and JavaFX version.
        final String javaVersion = System.getProperty("java.version");
        final String javafxVersion = System.getProperty("javafx.version");
        // change the text of the label.
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }
}
