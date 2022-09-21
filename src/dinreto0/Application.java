/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0;

import java.util.ResourceBundle;
import model.Model;
import model.ModelFactory;
import ui.View;
import ui.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

    private static final String VIEW_TYPE = ResourceBundle.getBundle("dinreto0.config").getString("view");
    private static final String MODEL_TYPE = ResourceBundle.getBundle("dinreto0.config").getString("model");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View view = ViewFactory.getView(VIEW_TYPE);
        Model model = ModelFactory.getModel(MODEL_TYPE);

        Controller con = new Controller();
        con.run(view, model);

    }

}
