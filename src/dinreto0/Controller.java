/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinreto0;

import model.Model;
import ui.View;

/**
 * Ejecutamos los métodos de las interfaces de vista y de modelo
 *
 * @author josue y henrique
 *
 */
public class Controller {

    public void run(View v, Model m) {
        v.showGreeting(m.getGreeting());
    }

}
