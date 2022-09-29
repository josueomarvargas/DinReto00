/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**

 * Clase que implementa la interfaz View que ejecutará una ventana usando JavaFX
 *
 * @author josue y henrique
 */
public class ViewImplementationFX extends Application implements View {

    /**
     * Este método que implementa la interfaz View le pasa el String al método
     * {@code launch()} que ejecuta el programa
     *
     * @param text
     */
    @Override
    public void showGreeting(String text) {
        launch(text);
    }

    /**
     * Este método es el que inicia la ventana JavaFX, el texto se inicializa
     * con el valor recogido usando el método {@code getParameters()}
     *
     * @param primaryStage
     */
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
