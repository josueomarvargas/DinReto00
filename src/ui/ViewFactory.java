/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.logging.Level;

/**
 * Clase que devuelve una clase que implementa la interfaz vista
 *
 * @author josue y henrique
 */
public class ViewFactory {

    /**
     * Devuelve una vista dependiendo del valor que está en el archivo de
     * propiedades
     *
     * @param vType
     * @return view devuelve la vista
     */
    public static View getView(String vType) {
        if (vType.equalsIgnoreCase("fx")) {
            System.out.println("ui.ViewFactory.getView()");
            return new ViewImplementationFX();
        } else if (vType.equalsIgnoreCase("swing")) {
            return new ViewImplementationJSwing();
        } else if (vType.equalsIgnoreCase("text")) {
            return new ViewImplementationText();
        }
        java.util.logging.Logger.getLogger(ViewFactory.class.getName()).log(Level.SEVERE, null,
                "Properties value not valid, only use 'fx', 'swing', 'text', using 'text' as default UI ");
        return new ViewImplementationText();
    }

}
