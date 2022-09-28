/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ui;

import javafx.application.Application;
import javafx.scene.Scene;  
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author josue
 */
public class ViewImplementationFX extends Application implements View {
     
    @Override
    public void showGreeting(String text) {
        launch(text);
    }

    @Override
    public void start(Stage primaryStage) {
        Text txt = new Text(getParameters().getRaw().get(0));
        StackPane root = new StackPane();
        root.getChildren().add(txt);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("DIN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
