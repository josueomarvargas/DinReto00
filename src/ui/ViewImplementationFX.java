/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author josue
 */
public class ViewImplementationFX extends Application implements View {
       @Override
    public void showGreeting(String text) {

        
    }
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        String text= "hola";
        
        btn.setText(text);
       
        
       
        
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
