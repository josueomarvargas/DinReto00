/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz para recoger el dato desde un archivo de
 * texto
 *
 * @author josue y henrique
 */
public class ModelImplementationFile implements Model {

    @Override
    public String getGreeting() {
        String greeting = "";
        try {
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            //Crea el fiichero, seleccionando el fichero que tenemos creado en el modelo
            //Escanea el fichero
            Scanner reader = new Scanner(getClass().getResourceAsStream("greeting.txt"));

            //recorre el fichero
            while (reader.hasNextLine()) {
                greeting += reader.nextLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(ModelImplementationFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return greeting;
    }

}
