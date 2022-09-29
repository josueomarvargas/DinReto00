/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinreto0;

import model.Model;
import ui.View;

/**
 *
 * @author yeguo
 */
public class Controller {
 //Ejecutamos la vista y el modelo 
    public void run(View v, Model m){
        v.showGreeting(m.getGreeting());
    }
    
}
