/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;


/**
 *
 * @author yeguo
 */
public class ViewFactory {
    
    public static View getView(String vType) {
        if (vType.equalsIgnoreCase("fx")) {
            //System.out.println("ui.ViewFactory.getView()");
            return new ViewImplementationFX();
        } else if (vType.equalsIgnoreCase("swing")) {
            return new ViewImplementationJSwing();
        } else {
            return new ViewImplementationText();
        }
    }
    
}
