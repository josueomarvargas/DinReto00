/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Level;

/**
 * Clase que devuelve una instancia de una clase que implementa la interfaz
 *
 * @author josue y henrique
 */
public class ModelFactory {

    /**
     * Selecciona si queremos mostrar por fichero o base de Datos
     *
     * @param mType model type
     * @return Instancia de la implementación dependiendo del valor que se
     * encuentra en properties
     */
    public static Model getModel(String mType) {
        if (mType.equalsIgnoreCase("mysql")) {
            return new ModelImplementationBD();
        } else if (mType.equalsIgnoreCase("file")) {
            return new ModelImplementationFile();
        }
        java.util.logging.Logger.getLogger(ModelFactory.class.getName()).log(Level.WARNING,
                "Properties model value not valid, only use 'mysql' and 'file', using file as default");
        return new ModelImplementationFile();
    }

}
