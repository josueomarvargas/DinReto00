/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.ResourceBundle;

/**
 *
 * @author yeguo
 */
public class ViewFactory {

    public static View getView(String vType) {
        if (vType.equalsIgnoreCase("fx")) {
            return (View) new ViewImplementationFX();
        }else {
            return new ViewImplementationText();
        }
    }

}
