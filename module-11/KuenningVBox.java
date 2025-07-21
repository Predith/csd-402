// Kristopher Kuenning
// 07/20/2025
// CSD 402
// Module 11

/**
 * Demonstrates VBox layout with spacing, margins, padding, alignment, and vgrow.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KuenningVBox extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField("Enter text");
        Button playBtn = new Button("Play");
        Button stopBtn = new Button("Stop");

        VBox vbox = new VBox(15, textField, playBtn, stopBtn);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);
        VBox.setMargin(playBtn, new Insets(10, 0, 10, 0));
        VBox.setVgrow(textField, Priority.ALWAYS);
        vbox.setFillWidth(true);

        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("JavaFX VBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

