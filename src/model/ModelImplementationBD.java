/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa el modelo para recoger el dato desde una base de datos
 *
 * @author josue y henrique
 */
public class ModelImplementationBD implements Model {

    /**
     * Obtienes la Url, user y pass del config-properties
     */
    private static final String URL = ResourceBundle.getBundle("dinreto0.config").getString("url");
    private static final String USER = ResourceBundle.getBundle("dinreto0.config").getString("user");
    private static final String PASS = ResourceBundle.getBundle("dinreto0.config").getString("pass");

    /**
     * Metodo que recogera el saludo de la BD
     *
     *
     * @return "saludo"
     */
    @Override
    public String getGreeting() {
        String saludo = "";
        try {
            // Conexion a la base de Datos*

            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Statement stmt = con.createStatement();
            //Ejecutar Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM GREETING");
            while (rs.next()) {
                saludo += rs.getString("saludo") + "\n";

            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelImplementationBD.class.getName()).log(Level.SEVERE, null, ex);

        }

        return saludo;
    }

}
