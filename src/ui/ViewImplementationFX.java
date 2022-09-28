/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author josue
 */
public class ViewImplementationFX extends Application implements View {

    private String saludo="";

    @Override
    public void showGreeting(String text) {
        saludo = text;
    }

    @Override

    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText(saludo);

        Scene scene = new Scene(btn, 300, 250);

        primaryStage.setTitle("DIN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
