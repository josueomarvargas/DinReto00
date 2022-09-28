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
 
    
        public static Model getModel(String mType) {
        if (mType.equalsIgnoreCase("mysql")) {
            return new ModelImplementationBD();
        }else {
            return new ModelImplementationFile();
        }
    }
    
    
}
