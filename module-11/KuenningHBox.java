// Kristopher Kuenning
// 07/20/2025
// CSD 402
// Module 11

/**
 * Demonstrates HBox layout with spacing, margins, padding, alignment, and hgrow.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class KuenningHBox extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField("Type here");
        Button playBtn = new Button("Play");
        Button stopBtn = new Button("Stop");

        HBox hbox = new HBox(10, textField, playBtn, stopBtn);
        hbox.setPadding(new Insets(15));
        hbox.setAlignment(Pos.CENTER_LEFT);
        HBox.setMargin(playBtn, new Insets(0,20,0,0));
        HBox.setHgrow(textField, Priority.ALWAYS);
        hbox.setFillHeight(true);

        Scene scene = new Scene(hbox, 500, 100);
        stage.setTitle("JavaFX HBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
