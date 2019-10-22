package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FirstJavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("First JavaFX Window");

        FlowPane flowPaneNode = new FlowPane();

        Scene scene = new Scene(flowPaneNode, 300, 300);

        primaryStage.setScene(scene);

        Label label = new Label("This is a label");

        flowPaneNode.getChildren().add(label);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
