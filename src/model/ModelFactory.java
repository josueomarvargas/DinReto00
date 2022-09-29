/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author yeguo
 */
public class ModelFactory {

     //private static final String MODEL_TYPE = ResourceBundle.getBundle("dinreto0.config").getString("model");
/**
 * Selecciona si queremos mostrar los fatos por fichero o base de Datos
 * 
 * @param mType
 * @return 
 */
        public static Model getModel(String mType) {
        if (mType.equalsIgnoreCase("mysql")) {
            return new ModelImplementationBD();
        }else {
           // System.out.println(MODEL_TYPE);
            return new ModelImplementationFile();
        }
    }
    
    
}
