/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yeguo
 */
public class ModelImplementationFile implements Model {

    @Override
    public String getGreeting() {
        String greeting = "";
        try {
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            //Crea el fiichero, seleccionando el fichero que tenemos creado en el modelo
            File txt = new File("src/model/greeting.txt");
            //Escanea el fichero
            Scanner reader = new Scanner(txt);

            //recorre el fichero
            while (reader.hasNextLine()) {
                greeting += reader.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelImplementationFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return greeting;
    }

}
